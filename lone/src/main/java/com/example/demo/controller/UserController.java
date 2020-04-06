package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.GetLoanDao;
import com.example.demo.dao.LoanResDao;
import com.example.demo.dao.UserDao;
import com.example.demo.dao.UserResDao;
import com.example.demo.dto.GetLoanDto;
import com.example.demo.dto.ResponseStatusDto;
import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserResDto;
import com.example.demo.service.LoanServiceImpl;

@RestController
public class UserController {
	@Autowired
	private LoanServiceImpl loneimpl;
	
	@RequestMapping(value = "/createuser",method = RequestMethod.POST,consumes = "application/json")
	UserResDto createuserDetails(@RequestBody UserDto dto)
	{
		
		/*ReadingData ud= new ReadingData();
		try {
			UserResDto res=	ud.readFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		UserDao dao= new UserDao();
		BeanUtils.copyProperties(dto, dao);
		UserResDao resdao=loneimpl.LoaduserDetails(dao);
		UserResDto res= new UserResDto();
		BeanUtils.copyProperties(resdao, res);
		return res;
	}
		
	@RequestMapping(value = "/getlone",method = RequestMethod.POST,consumes = "application/json")
	public ResponseStatusDto appalyLone(@RequestBody GetLoanDto dto)
	{
		GetLoanDao dao = new GetLoanDao();
		BeanUtils.copyProperties(dto, dao);
		LoanResDao resdao=loneimpl.checkLoneEle(dao);
		ResponseStatusDto  res= new ResponseStatusDto();
		BeanUtils.copyProperties(resdao, res);
		return res;
		
	}
	@RequestMapping(value = "/list/{id}")
	public List getLoneList(@PathVariable("id") int id)
	{
		return  loneimpl.getLonelist(id);
		
	}
}




