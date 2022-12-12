package com.base.java;

class orginal_image implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			
			for(int j=2*(5-i);j>=0;j--) {
				System.out.print("*");
			}
			System.out.println("");
		
		}
		System.out.println("Mirror Image is proccess please wait.....");
	}
}
class mirror implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<i*2;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
public class mirror_image {

	public static void main(String[] args) {
		orginal_image o=new orginal_image();
		mirror m=new mirror();
		Thread t=new Thread(o);
		Thread t1=new Thread(m);
		t.start();
		
		try {
			t.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		t1.start();
		


	}

}
