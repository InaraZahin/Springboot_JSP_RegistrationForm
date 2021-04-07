package com.example.SmallWebApp;

import java.util.Arrays;

public class UserRegistration {
	private String Uname;
	private String EmailId;
	private String Password;
	private Byte Gender;
	private String[] Hobby;
	
	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname = uname;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Byte getGender() {
		return Gender;
	}
	public void setGender(Byte gender) {
		Gender = gender;
	}
	public String[] getHobby() {
		return Hobby;
	}
	public void setHobby(String[] Hobby) {
		this.Hobby = Hobby;
	}
	@Override
	public String toString() {
		return "UserRegistration [Uname=" + Uname + ", EmailId=" + EmailId + ", Password=" + Password + ", Gender="
				+ Gender + ", Hobby=" + Arrays.toString(Hobby) + "]";
	}
	
	
	
	
	
	
	

}
