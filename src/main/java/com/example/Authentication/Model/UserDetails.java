package com.example.Authentication.Model;

public class UserDetails {

	private String name;
	
	private String pwd;

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

	@Override
	public String toString() {
		return "UserDetails [name=" + name + ", pwd=" + pwd + "]";
	}
	
}
