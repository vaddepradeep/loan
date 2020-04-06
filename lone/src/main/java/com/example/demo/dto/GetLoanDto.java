package com.example.demo.dto;

public class GetLoanDto {
	private int userid;
	//private  int Loneid;
	private int amount;
	private int mounths;
	private String loneType;


	public String getLoneType() {
		return loneType;
	}

	public void setLoneType(String loneType) {
		this.loneType = loneType;
	}

	/*public int getLoneid() {
		return Loneid;
	}

	public void setLoneid(int loneid) {
		Loneid = loneid;
	}*/

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

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	
	

}
