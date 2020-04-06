package com.example.demo.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.UserDao;
import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserResDto;

/*public class ReadingData {
	@Autowired
	private  LoneServiceImpl userdata;
	String line="";
	UserDao dao= new UserDao();
	public UserResDto readFile() throws IOException
	{
	try {
		BufferedReader br= new BufferedReader(new FileReader("src\\main\\resources\\user.csv.xlsx"));
		
		while((line=br.readLine())!=null)
		{
			String data[]=line.split(",");
			UserDto dto= new UserDto();
			dto.setUserid(Integer.parseInt(data[0]));
			dto.setUname(data[1]);
			dto.setGender(data[2]);
			dto.setAge(Integer.parseInt(data[3]));
			dto.setPan(data[4]);
			dto.setAadher(Integer.parseInt(data[5]));
			dto.setSalary(Integer.parseInt(data[6]));
			
			
			BeanUtils.copyProperties(dto, dao);
			
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
	}
}*/
