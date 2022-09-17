package com.Hello;
import java.util.Scanner;
public class NumberInReverse {

	public static void main(String[] args) {
		
		int number;
		int reverse=0;
		
		System.out.println("Enter the number");
		
		Scanner sc= new Scanner(System.in);
		number= sc.nextInt();
		
		System.out.println("Reverse number");
		
		for (;number!=0; number=number/10) {
			int reminder= number%10;
			reverse=reverse*10+reminder;}
		System.out.println(reverse);
		}
	}

