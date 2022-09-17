package com.Hello;
import java.util.Scanner;
public class Greater_Than_100ex2 {

	public static void main(String[]args) {
		int a;
		Scanner sc =new Scanner( System.in);
		
		System.out.println("Enter the number");
	     a = sc.nextInt();
	     if (a>100) {System.out.println("Greater than 100");}
	     else { System.out.println("Lower than 100");}
	     
		
	}
}
