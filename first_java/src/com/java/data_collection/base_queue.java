package com.java.data_collection;
import java.util.*;


public class base_queue {

	public static void main(String[] args) {
		
		Queue<Integer> Iq=new PriorityQueue<>();
		for(int i=1;i<12;i++) {
			Iq.add(i);
		
		}
		System.out.println("The value is "+Iq+"\n"); //The value is [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]

		Iq.remove(5);
		System.out.println("Using remove method: "+Iq);//Using remove method: [1, 2, 3, 4, 10, 6, 7, 8, 9, 11]
		Iq.element();
		System.out.println("using element method "+Iq+"\n");//using element method [1, 2, 3, 4, 10, 6, 7, 8, 9, 11]
		Iq.offer(3);
		System.out.println("using offer method "+Iq+"\n");//using offer method [1, 2, 3, 4, 3, 6, 7, 8, 9, 11, 10]
		Iq.poll();
		System.out.println("Using poll method "+Iq+"\n");//Using poll method [2, 3, 3, 4, 10, 6, 7, 8, 9, 11]

		
		System.out.println("The size is "+Iq.size()+"\n");//The size is 10
		Iq.clear();
		System.out.println("The value is "+Iq+"\n");//The value is []

		
		
	}

}
