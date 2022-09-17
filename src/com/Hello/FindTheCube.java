package com.Hello;
import java.util.Scanner;

public class FindTheCube {
	static int number;
	
	
	public int getNumberCube(int number) {
		return number;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);
		number= sc.nextInt();
		
		FindTheCube cube =new FindTheCube();
		cube.getNumberCube(5);
		number=number*number*number;
		System.out.println(number);
		
		
		
	}

}
