package com.example.demo.dao;

public class GetLoanDao {
	
	private int userid;
	//private  int Loneid;
	private int amount;
	private int mounths;
	private String loneType;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getMounths() {
		return mounths;
	}
	public void setMounths(int mounths) {
		this.mounths = mounths;
	}
	public String getLoneType() {
		return loneType;
	}
	public void setLoneType(String loneType) {
		this.loneType = loneType;
	}
}
