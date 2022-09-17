package com.Hello;
import java.util.Scanner;

public class Check_Largest_Numberex2 {
	public static void main (String[]args) {
		Scanner sc=new Scanner(System.in);
		int a;
		int b;
		int c;
		System.out.println("Enter First number");
		a =sc.nextInt();
		System.out.println("Enter second number");
		b=sc.nextInt();
		System.out.println("Enter Third number");
		c=sc.nextInt();
		if(a>b && a>c) {System.out.println("First is largest");}
		else if (b>a && b>c) { System.out.println("Second is largest");}
		else { System.out.println ("Third is largest");}
		
		
	}

}
