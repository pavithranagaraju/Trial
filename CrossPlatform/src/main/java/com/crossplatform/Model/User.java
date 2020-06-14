package com.crossplatform.Model;

public class User {
	String name,email,psw,firstpref,secondpref,thirdpref;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public String getFirstpref() {
		return firstpref;
	}

	public void setFirstpref(String firstpref) {
		this.firstpref = firstpref;
	}

	public String getSecondpref() {
		return secondpref;
	}

	public void setSecondpref(String secondpref) {
		this.secondpref = secondpref;
	}

	public String getThirdpref() {
		return thirdpref;
	}

	public void setThirdpref(String thirdpref) {
		this.thirdpref = thirdpref;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", psw=" + psw + ", firstpref=" + firstpref + ", secondpref="
				+ secondpref + ", thirdpref=" + thirdpref + "]";
	}

	public User(String name, String email, String psw, String firstpref, String secondpref, String thirdpref) {
		super();
		this.name = name;
		this.email = email;
		this.psw = psw;
		this.firstpref = firstpref;
		this.secondpref = secondpref;
		this.thirdpref = thirdpref;
	}
public User(){
	
}
}
