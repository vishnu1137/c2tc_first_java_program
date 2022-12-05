package newjava;
import java.io.*;

public class Reg {

	public static void main(String args[])throws Exception{             
	    BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
	    System.out.print("Enter Your Name: ");
	    String name=read.readLine();
	    System.out.print("Enter Your Age: ");
	    int age=Integer.parseInt(read.readLine());
	    System.out.print("Enter Your Id: ");
	    int id=Integer.parseInt(read.readLine());
	    System.out.println("\nName: "+name);
	    System.out.println("Age: "+age);
	    System.out.println("Id: "+id);
	    
	}    

}
