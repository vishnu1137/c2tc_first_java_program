package newjava;
import java.util.*;

class info{
	private String name;
	private int age;
	private double weight;
	private double height;
	
	// get name 
	public String getName() {
		return name;
	}
	public void setName(String newname) {
		this.name = newname;
	}
	// get age
	public int getage() {
		return age;
	}
	public void setage(int newage) {
		this.age=newage;
	}
	// get weight
	public double getweight() {
		return weight;
	}
	public void setweight(double newweight) {
		this.weight=newweight;
	}
	// get height
	public double getheight() {
		return height;
	}
	public void setheight(double newheight) {
		this.height=newheight;
	}
}
public class simple {
	
	public static void main(String[] args) {
		info i=new info();
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Your Name: ");
		
		String names=s.nextLine();
		System.out.print("Enter Your Age: ");
		int u_age=s.nextInt();
		System.out.print("Enter Your Weight: ");
		double u_weight=s.nextDouble();
		System.out.print("Enter Your Height: ");
		double u_height=s.nextDouble();
		i.setName(names);
		i.setage(u_age);
		i.setweight(u_weight);
		i.setheight(u_height);
		float m= (float) i.getheight()/100;
		double BMI;
		BMI=i.getweight()/(m*m);
		if(BMI<18.5) {
			System.out.println("Your Name is "+i.getName()+" and Age "+i.getage()+
					"\n And Your BMI(Body Mass Index) is: "+BMI);
			System.out.println("Your BMI is Below 18.5 and Your are Underweight ");
		}
		else if(BMI==18.5 || BMI<=24.9) {
			System.out.println("Your Name is "+i.getName()+" and Age "+i.getage()+
					"\nAnd Your BMI(Body Mass Index) is: "+BMI);
			System.out.println("Your BMI is 18.5-24.9 and Your are Normal and Healthy Weight ");
			
		}
		else if(BMI==25 || BMI<=29.9) {
			System.out.println("Your Name is "+i.getName()+" and Age "+i.getage()+
					"\nAnd Your BMI(Body Mass Index) is: "+BMI);
			System.out.println("Your BMI is 25-29.9 and Your are OverWeight ");
			
		}
		else if(BMI>=30) {
			System.out.println("Your Name is "+i.getName()+" and Age "+i.getage()+
					"\nAnd Your BMI(Body Mass Index) is: "+BMI);
			System.out.println("Your BMI is above 30 and Your are Obese ");
			
		}
		else {
			System.out.println("Your something Wrong and Try to Correct");
		}
		
		
	}

	
}
