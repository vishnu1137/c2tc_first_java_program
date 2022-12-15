package com.java.lambda;

import java.util.function.IntPredicate;
import java.util.*;

public class condition_lambda {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int j=s.nextInt();
		
		IntPredicate ip=i->i>=18;
		IntPredicate ip1=i->i<18;
				System.out.println(ip.or(ip1).test(j));

	}

}
