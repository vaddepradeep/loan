package com.example.demo.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loan")
public class LoanDao {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int loneid;
	private int userid;
	private double loneamt;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getLoneid() {
		return loneid;
	}
	public void setLoneid(int loneid) {
		this.loneid = loneid;
	}
	public double getLoneamt() {
		return loneamt;
	}  
	public void setLoneamt(double loneamt) {
		this.loneamt = loneamt;
	}

}
