package com.Hello;

public class Cube {
	
	public int getNumberCube(int num) {
		return num;
		
	}
	
	public static void main(String[] args) {
		
		int num= 2;
		num=num*num*num;
		
		Cube cube=new Cube();
		
		
		cube.getNumberCube(5);
		 System.out.println(num);
	}

}
