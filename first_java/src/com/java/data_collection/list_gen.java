package com.java.data_collection;


class test<T>{
	T obj;

	public test(T obj) {
		super();
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}

	
	public String toString() {
		return "test [obj=" + obj + "]";
	}
	
}

class info<T,U>{
	T obj1;
	U obj2;
	public info(T obj1, U obj2) {
		
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	public T getObj1() {
		return obj1;
	}
	public U getObj2() {
		return obj2;
	}
	
	public String toString() {
		return "info [obj1=" + obj1 + ", obj2=" + obj2 + "]";
	}
	

}


public class list_gen {

	public static void main(String[] args) {
		
		
		test<String> sobj=new test<String>("vijay");
		System.out.println("Your name is "+sobj.getObj());
		
		test<Integer> iobj=new test<Integer>(22);
		System.out.println("Your age is "+iobj.getObj());
		
		info<String,String> lobj=new info<String,String>("122342343","chennai"); 
		System.out.println("Your mobile no is "+lobj.getObj1() +" And Location "+lobj.getObj2());

	}

}
