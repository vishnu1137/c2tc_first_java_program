package com.user.caller;
import com.bank.user.*;

public class unauth_call {
	
	public void custom_info(){
		user_info i=new user_info();
		System.out.println("User Name is "+i.user_Name);
		
	}

	public static void main(String[] args) {
		
		unauth_call a=new unauth_call();
		a.custom_info();

	}

}
