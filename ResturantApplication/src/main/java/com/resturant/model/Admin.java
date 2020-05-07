package com.resturant.model;

public class Admin {
int id;

String name;
String pwd;
long phno;
String emailid;
String gender;
String address;
@Override
public String toString() {
	return "Admin [id=" + id + ", name=" + name + ", pwd=" + pwd + ", phno=" + phno + ", emailid=" + emailid
			+ ", gender=" + gender + ", address=" + address + "]";
}
public int getId() {
	return id;
}
public Admin() {
	super();
	// TODO Auto-generated constructor stub
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
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
public Admin(int id, String name, String pwd, long phno, String emailid, String gender, String address) {
	super();
	this.id = id;
	this.name = name;
	this.pwd = pwd;
	this.phno = phno;
	this.emailid = emailid;
	this.gender = gender;
	this.address = address;
}


}
