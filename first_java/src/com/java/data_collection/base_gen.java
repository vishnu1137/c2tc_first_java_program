package com.java.data_collection;

class Data {
	private int num;
	private int add;

	public Data(int num,int add) {
		
		this.num = num;
		this.add = add;
	}

	public int getNum() {
		return num;
	}
	public int getAdd() {
		return add;
	}

	@Override
	public String toString() {
		return "Data [num=" + num + ", add=" + add + "]";
	}
	
}

public class base_gen {

	public static void main(String[] args) {
		Data s=new Data(45,55);
		Integer us=s.getNum();
		Integer u=s.getAdd();
		System.out.println(us+u);
		
		

	}

}
