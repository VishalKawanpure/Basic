package com.Hello;
import java.util.Scanner;

public class CheckNumberPositiveOrNegativeEx2 {
	public static void main (String[]args) {
		int number;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		number= sc.nextInt();
		sc.close();
		if (number>0) {System.out.println("Number is Positive");}
		else if (number<0) {System.out.println("Number is negative");}
		else {System.out.println("Number is zero");}
		
		
		
	}}