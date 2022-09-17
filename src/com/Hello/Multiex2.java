package com.Hello;
import java.util.Scanner;
public class Multiex2 {
	public static void main(String[]args) {
		int a;
		int i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		a=sc.nextInt();
		for (i=1; i<=10; i++) { System.out.println(a*i);}
	}

}
