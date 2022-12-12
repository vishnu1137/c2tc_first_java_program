package com.java.data_collection;
import java.util.*;


public class base_queue {

	public static void main(String[] args) {
		
		Queue<Integer> Iq=new PriorityQueue<>();
		for(int i=1;i<12;i++) {
			Iq.add(i);
		
		}
		System.out.println("The value is "+Iq+"\n");
		Iq.remove(5);
		System.out.println("Using remove method: "+Iq);
		Iq.element();
		System.out.println("using element method "+Iq+"\n");
		Iq.offer(3);
		System.out.println("using offer method "+Iq+"\n");
		Iq.poll();
		System.out.println("Using poll method "+Iq+"\n");
		
		System.out.println("The size is "+Iq.size()+"\n");
		Iq.clear();
		System.out.println("The value is "+Iq+"\n");
		
		
	}

}
