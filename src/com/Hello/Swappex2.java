package com.Hello;
import java.util.Scanner;

public class Swappex2 {
	public static void main(String[] args) {
		int a;
		int b;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers to swap");
		a=sc.nextInt();
		b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of a is ="+a+ "....and value of b is="+b);
	}
}
