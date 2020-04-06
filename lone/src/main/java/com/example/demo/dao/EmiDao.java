package com.example.demo.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class EmiDao {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int emiid;
	private int loneid;
	private int userid;
	private double totalamount;
	private double rateofInterst;
	private double emiamt;
	private int pendingmounths;
	public int getEmiid() {
		return emiid;
	}
	public void setEmiid(int emiid) {
		this.emiid = emiid;
	}
	public int getLoneid() {
		return loneid;
	}
	public void setLoneid(int loneid) {
		this.loneid = loneid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public double getEmiamt() {
		return emiamt;
	}
	public void setEmiamt(double emiamt) {
		this.emiamt = emiamt;
	}
	public int getPendingmounths() {
		return pendingmounths;
	}
	public void setPendingmounths(int pendingmounths) {
		this.pendingmounths = pendingmounths;
		
	}
	public double getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(double totalamount) {
		this.totalamount = totalamount;
	}
	public double getRateofInterst() {
		return rateofInterst;
	}
	public void setRateofInterst(double rateofInterst) {
		this.rateofInterst = rateofInterst;
	}
	

}
