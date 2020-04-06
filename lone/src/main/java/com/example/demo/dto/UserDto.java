package com.example.demo.dto;

import java.util.Set;

public class UserDto {
	private int userid;
	private String uname;
	private long salary;
	private int age; 
	private String gender;
	private String pan;
	private long aadher;
	//private Set lone;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public long getAadher() {
		return aadher;
	}
	public void setAadher(long aadher) {
		this.aadher = aadher;
	}

}
