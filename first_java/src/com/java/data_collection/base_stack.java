package com.java.data_collection;
import java.util.*;

public class base_stack {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		Stack<Integer> Is=new Stack();
		int c=12;
		while(c<=22) {
			Is.push(c);
			c++;
		}
		System.out.println("You add any value ,Please enter 1");
		System.out.println("you remove any value ,please enter 2");
		System.out.println("you remove only last value ,please enter 3");
		System.out.println("you add any value at any place ,please enter 4");
		System.out.println("you get only first value ,please enter 5");
		System.out.println("you get only last value ,please enter 6");
		System.out.println("you get any value ,please enter 7");
		System.out.println("you can search any value ,please enter 8");
		System.out.println("can you see only hole value of stack ,please enter 9");
		
		
		
		System.out.print("Enter your choice 1-9 number : ");
		int i=n.nextInt();
					
		
		switch(i) {
		
		case(1):
			System.out.println("Enter the adding value");
			int z=n.nextInt();
			Is.add(z);
			System.out.println("your stack value is "+Is);
			break;			
		case(2):
			System.out.println("which place element is remove ,enter 0-11 ");
			int y=n.nextInt();
			Is.add(y);
			System.out.println("your stack value is "+Is);
			break;			
		case(3):
			System.out.println("remove only last element");
		
			Is.pop();
			System.out.println("your stack value is "+Is);
			break;			
		case(4):
			System.out.println("first enter the place value, enter 0-11 ");
			int x=n.nextInt();
			System.out.print("enter the added value");
			int x1=n.nextInt();
			Is.add(x,x1);
			System.out.println("your stack value is "+Is);
			break;			
		case(5):
			
			System.out.println("first value of stack is "+Is.firstElement());
			break;			
		case(6):
			
			System.out.println("your stack value is "+Is.lastElement());
			break;								
		case(7):
			System.out.println("which place value you get ,enter 0-11");
			int w=n.nextInt();
			
			System.out.println("get the "+w+"th element "+Is.get(w));
			break;			
		case(9):
			System.out.println("your stack value is "+Is.peek());
			break;
		case(8):
			System.out.println("you can search any valid value ");
			int w1=n.nextInt();

			System.out.println("the search value of "+w1+" is "+Is.search(w1));
			break;
		default:
			System.out.println("Please enter the valid number ");
			break;
							
		} 
		
		
		
		
	}

}
