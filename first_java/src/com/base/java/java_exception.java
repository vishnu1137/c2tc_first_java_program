package com.base.java;

interface exceptions{
	abstract void divi(int num1,int num2);
	abstract void arrays();
}

public class java_exception implements exceptions{
	
	int result;
	int [] arr =new int [4];
	
	
	public void arrays() {	//checked Exception
		
		try {
			int i=arr[4];
			System.out.println("i value is : "+ i);
		}
		catch(Exception e){
			System.out.println("Exception caught: "+e);
		}
		finally {
			System.out.println("array value is :"+ arr+"\n");
		}
	}
	
	public void divi(int num1,int num2) {	//unchecked Exceptions
		try {
			result=num1/num2;
		}
		catch(ArithmeticException e){
			System.out.println("Exception caught: "+e);
		}
		finally {
			System.out.println("Result: "+ result+"\n");
		}
	}

	
	public static void main(String[] args) {
		
		
		java_exception e=new java_exception();
		System.out.println("\t \tunchecked exception\n");
		e.divi(23, 0);
		System.out.println("\t \tchecked exception\n");
		e.arrays();
		
	}

}
