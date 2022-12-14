package com.java.data_collection;
import java.util.*;

class listed extends Thread{
	public void run() {
		LinkedList <String> ac=new LinkedList<>();
		System.out.println("Asian Countries\n");
		ac.add("India");
		ac.add("Indonesia");
		ac.add("China");
		ac.add("Thailand");
		ac.add("Malaysia");
		ac.add("Japan");
		ac.add("Pakistan");
		System.out.println(ac);
		ac.set(1,"china");
		System.out.println(ac);
		System.out.println("get the first element: "+ac.getFirst()+" ,get the last element: "+ac.getLast());
		ac.remove("china");
		System.out.println(ac);
		ac.removeLast();
		System.out.println(ac+"\n");
		
		
	}
	
}
public class base_Lists extends Thread {

	public void run() {
		ArrayList<String> A=new ArrayList<>();
		System.out.println("American Countries\n");

		A.add("United states");
		A.add("Canada");
		A.add("Mexico");
		A.add("Brazil");
		A.add("Colombia");
		A.add("Cuba");
		A.add("Peru");
		System.out.println(A);
		A.set(1,"Chile");
		System.out.println(A);
		System.out.println("get the first element: "+A.get(3)+" ,get the last element: "+A.get(6));
		A.remove("chile");
		System.out.println(A);
		A.remove(5);
		System.out.println(A+"\n");
	}
	public static void main(String[] args) {
		listed l=new listed();
		base_Lists b=new base_Lists();
		
		b.start();
		l.start();
	}

}
