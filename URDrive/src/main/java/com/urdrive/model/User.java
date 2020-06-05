package com.urdrive.model;

public class User {
	String name,password;
	int ID;
	ACCESS userAccess;
	
	
	
	
	
	
	
	
	public User(String name, String password, int iD, ACCESS userAccess) {
		super();
		this.name = name;
		this.password = password;
		ID = iD;
		this.userAccess = userAccess;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public ACCESS getUserAccess() {
		return userAccess;
	}
	public void setUserAccess(ACCESS userAccess) {
		this.userAccess = userAccess;
	} 
	
}
