package com.java.lambda;

interface Lambda{
	public void disp();
}

public class base_lambda {
	public static void main(String[] args) {
		Lambda obj=() ->{
			System.out.println(" hi everyone ");
			System.out.println(" I'm using lambda");
		};
		obj.disp();
	}
	
}
