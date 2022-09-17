package com.Hello;
import java.util.Scanner;
public class Factorss {
	
	public static void main(String[] args) {
		
		int num;
		
		System.out.println("Enter the number to find the factors");
		Scanner sc=new Scanner(System.in);
		num= sc.nextInt();
		
		System.out.println("Factors are");
		
		for(int i =1; i<=num; i++) { 
			if(num % i==0) {System.out.println(i);}
	}
	

}}
