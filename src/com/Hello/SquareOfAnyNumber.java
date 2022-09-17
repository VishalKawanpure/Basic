package com.Hello;

import java.util.Scanner;

public class SquareOfAnyNumber {
	
	public static void main(String[] args) {
		
		int num;
		
		System.out.println("Enter the number");
		
		Scanner sc=new Scanner(System.in);
		
		num= sc.nextInt();
		
		int square= num*num;
		
		System.out.println("Square of "+ num + " is ="+ square);
	}

}
