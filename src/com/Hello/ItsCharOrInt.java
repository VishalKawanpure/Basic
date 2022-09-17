package com.Hello;

import java.util.Scanner;

public class ItsCharOrInt {
	public static void main(String[] args) {
		System.out.println("Enter the name");
		char ch;
		
		Scanner sc= new Scanner(System.in);
		
		
		ch= sc.next().charAt(0);
		
		
		if((ch>=65 && ch<=90) || (ch>=97 && ch <=122)){
			
			System.out.println("Is cahr");}
		
		
		else if (ch>=48 && ch <=57) { System.out.println("is num");
	}
		else { System.out.println("Is Spec char");}

}}


