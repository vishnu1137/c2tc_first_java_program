package com.base.java;

class edge extends Thread{
	public void run() {
		System.out.println("The edge id  : "+ Thread.currentThread().getId());
	
	}
}
class eclipse extends Thread{
	public void run() {
		
		System.out.println("The eclipse id : "+Thread.currentThread().getId());
		
	}
}
class notepad extends Thread{
	public void run() {
		
		System.out.println("The notepad id : "+Thread.currentThread().getId());
		
	}
}

public class threadings {

	public static void main(String[] args) {
		edge A=new edge();
		eclipse S=new eclipse();
		notepad M=new notepad();
		
		A.start();
		S.start();
		M.start();
		

	}

}
