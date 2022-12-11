package com.bank.user;

public class pan_card {
	private int pan_no=354423;
	
	private void pan() {
		
		user_info v=new user_info();
		System.out.println("name : "+ v.user_Name);
		System.out.println("Linked Bank Name : "+v.bank_Name);
		System.out.println("Bank Account Number : "+v.Account_no );
		System.out.println("pan card Number : "+ pan_no);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pan_card p=new pan_card();
		p.pan();

		
	}

}
