package com.example.demo.service;

import java.util.List;

import com.example.demo.dao.GetLoanDao;
import com.example.demo.dao.LoanResDao;
import com.example.demo.dao.UserDao;
import com.example.demo.dao.UserResDao;

public interface LoanService {
	UserResDao LoaduserDetails(UserDao dao);
	public double calLoanAmt(GetLoanDao dao);
	public LoanResDao checkLoneEle(GetLoanDao dao);
	public List getLonelist(int id);
	public  void calEmi(GetLoanDao dao);
	

}
