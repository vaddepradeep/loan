package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmiDao;
import com.example.demo.dao.GetLoanDao;
import com.example.demo.dao.LoanDao;
import com.example.demo.dao.LoanResDao;
import com.example.demo.dao.UserDao;
import com.example.demo.dao.UserResDao;
import com.example.demo.repo.LoneRepo;
import com.example.demo.repo.UserRepo;

@Service
public class LoanServiceImpl implements LoanService{
	@Autowired
	private  LoneRepo lonerepo;
	@Autowired
	private UserRepo  urepo;
	@Override
	public UserResDao LoaduserDetails(UserDao dao) {
		UserResDao response= new UserResDao();
		 boolean b=urepo.existsById(dao.getUserid());
		 if(b)
		 {
			 response.setErrorcode(701);
			 response.setErrormsg("file has duplicate  data check once");
			 return response;
		 }
		 else 
		 {
			 urepo.save(dao);
			 response.setErrorcode(200);
			 response.setErrormsg("data saved success fully");
			 return response;
		 }
	}

	@Override
	public double calLoanAmt(GetLoanDao dao) {
		int i=urepo.SalaryCheck(dao.getUserid());
		if(dao.getLoneType().equalsIgnoreCase("personal"))
		{
		double amt=(i*1.5);
		return amt;
		}
		else if(dao.getLoneType().equalsIgnoreCase("house"))
		{
			
			return i*3;
		}
		else
		{
			
			return i*0.20;
		}
	}

	@Override
	public LoanResDao checkLoneEle(GetLoanDao dao) {
		LoanResDao resdao= new LoanResDao();
		
		double d=calLoanAmt(dao);
		if(d>=dao.getAmount())
		{
			loanDetails(dao);
			calEmi(dao);
		resdao.setErrorcode(200);
		resdao.setErrormsg("Lonegranted  successfully");
		return resdao;
		}
		else
		{
			resdao.setErrorcode(601);
			resdao.setErrormsg("you are only eligible for"+d+"amount");
		return resdao;
		}
	}
public void loanDetails(GetLoanDao dao)
{
	LoanDao ldao= new LoanDao();
	ldao.setUserid(dao.getUserid());
	ldao.setLoneamt(dao.getAmount());
	boolean b=lonerepo.existsById(dao.getUserid());
	if(b)
	{
	
	}
	else
	{
	lonerepo.save(ldao);
} }

@Override
public List getLonelist(int id) {
	 
	 
	return lonerepo.findAllLones(id);
}

@Override
public void calEmi(GetLoanDao dao) {
	double d=calRateOfInter(dao);
	double t= calTotalAmt(dao);
	double e=calEmiAmt(dao);
	EmiDao edao = new EmiDao();
	edao.setLoneid();
	edao.setPendingmounths(dao.getMounths());

	
	edao.setEmiamt(e);
	edao.setRateofInterst(d);
	edao.setTotalamount(t);
	
	edao.setUserid(dao.getUserid());
	
}
public double calRateOfInter(GetLoanDao dao)
{
	if(dao.getLoneType().equalsIgnoreCase("personal"))
	{
		return 0.9;
	}
	else if(dao.getLoneType().equalsIgnoreCase("house"))
	{
		return 0.3;
	}
	else {
		return 0.7;
		
	}
	
}
public double calTotalAmt(GetLoanDao dao)
{
	double d=calRateOfInter(dao);
	double total=dao.getAmount()+dao.getAmount()*d;
	return total;
}

public  double calEmiAmt(GetLoanDao dao)
{
	double tot=calTotalAmt(dao);
	double e=tot/dao.getMounths();
	return e;
	
}
}
	
	

