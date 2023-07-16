package com.aioeam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class UserInfo {
	
	private String role;
	@Id
	@Column(name = "userId")
	private String userName;
	private String fName;
	private String lname;
	private String mobno;
	private String password;
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserInfo [role=" + role + ", userName=" + userName + ", fName=" + fName + ", lname=" + lname
				+ ", mobno=" + mobno + ", password=" + password + "]";
	}
	public UserInfo(String role, String userName, String fName, String lname, String mobno, String password) {
		super();
		this.role = role;
		this.userName = userName;
		this.fName = fName;
		this.lname = lname;
		this.mobno = mobno;
		this.password = password;
	}
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}