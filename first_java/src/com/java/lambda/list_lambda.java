package com.java.lambda;
import java.util.*;
class user{
	private String name;

	public user(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	
	public String toString() {
		return "user [name=" + name + "]";
	}
	
	
	
}

public class list_lambda {

	public static void main(String[] args) {
		
		List<user> u=new LinkedList<>();
		u.add(new user("vijay"));
		u.add(new user("mahe"));
		u.add(new user("ram"));
		u.add(new user("sasi"));
		System.out.println(u+"\n");
		
		Collections.sort(u,(user u1, user u2)->
		{
			
			return u1.getName().compareTo(u2.getName());
		});
		
		for (user us:u) {
			System.out.println(us.getName());
		}
		System.out.println("\n"+u);

	}

}
