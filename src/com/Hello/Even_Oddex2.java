package com.Hello;
import java.util.Scanner;

public class Even_Oddex2 {
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Enter the number");
		
		a=sc.nextInt();
		if (a%2==0) { System.out.println ("Number is Even");}
		else { System.out.println("Number is odd");}
		
		
	}

}
