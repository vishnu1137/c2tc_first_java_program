package com.java.data_collection;
import java.util.*;

public class base_set {

	public static void main(String[] args) {
		HashSet<Integer> alist=new HashSet<>();
		for(int i=1;i<12;i++) {
			alist.add(i);
		}
		
		//alist.add("hello");
		System.out.println(alist);
		alist.remove(5);
		System.out.println(alist);
		System.out.println(alist.getClass());
		System.out.println(alist.size());
	}

}
