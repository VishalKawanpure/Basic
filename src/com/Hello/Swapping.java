package com.Hello;
import java.util.Scanner;

public class Swapping {
	public static void main(String[] args) {
		int a;
		int b;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		a= a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a+ "and b="+b);
	}

}
