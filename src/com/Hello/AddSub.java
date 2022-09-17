package com.Hello;

public class AddSub {
	
	public int sum(int a, int b) {
		int c= a+b;
		return c;
	}
	
	static public void main(String[]args) {
		
		int x=10;
		int y=20;
		int z=x+y;
		
		AddSub add= new AddSub();
		
		add.sum(5, 15);
		
		
		
System.out.println(z);
	}

}
