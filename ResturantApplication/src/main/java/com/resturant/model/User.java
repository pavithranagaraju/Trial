package com.resturant.model;

public class User {
	private int user_id;
	private String  uname,psw,emailid,gender,address,subscription;
	private long phno;
	public User(int user_id, String uname,String psw, String emailid, String gender,
			String address, String subscription,long phno) {
		super();
		this.user_id = user_id;
		this.uname = uname;
		this.psw=psw;
		this.emailid = emailid;
		this.gender = gender;
		this.address = address;
		this.subscription = subscription;
		this.phno = phno;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", uname=" + uname + ", emailid=" + emailid + ", gender=" + gender
				+ ", address=" + address + ", subscription=" + subscription + ", phno=" + phno + "]";
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSubscription() {
		return subscription;
	}
	public void setSubscription(String subscription) {
		this.subscription = subscription;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}

	
}
