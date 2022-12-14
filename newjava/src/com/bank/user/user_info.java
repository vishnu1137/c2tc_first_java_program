package com.bank.user;
import java.util.*;

public class user_info{
	public String user_Name= "vijay";
	protected String bank_Name="SBI";
	protected String Account_no="23454******";
	protected String user_Mailid="vijay***7@gmail.com";
	private String user_Mobile_no="986456****";
	private int user_pin=4565;
	
	private void users() {
		System.out.println("User Name is "+user_Name);
		System.out.println("Bank Name is "+bank_Name);
		System.out.println("Account number is "+Account_no);
		System.out.println("user pin is  "+user_pin);
		System.out.println("user phone number is  "+user_Mobile_no);
		
	}

	public static void main(String[] args) {
		
		// get details
		user_info u=new user_info();
		u.users();
		
		

	}

}
