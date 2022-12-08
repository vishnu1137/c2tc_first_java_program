package first_java;

class box_unbox{
	public void box() { //boxing 
		int a=5;
		Integer b=new Integer(a);
		System.out.println("This is boxing value: "+b);
		
	}
	public void unbox() { //unboxing
		Integer n=new Integer(35);
		int m=n;
		System.out.println("This is Unboxing value: "+m);
		
	}
}
public class boxing_program {

	public static void main(String[] args) {
		
		box_unbox bo=new box_unbox();
		bo.box();
		bo.unbox();
		
	}

}
