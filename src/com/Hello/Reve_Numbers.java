package com.Hello;
import java.util.Scanner;
public class Reve_Numbers {
	
	public static void main(String[] args) {
		
		int num;
		int reverse= 0;
		
	System.out.println("Enter the number");
	
	Scanner sc=new Scanner(System.in);
	
	num=sc.nextInt();
	sc.close();
	for(; num!=0; num=num/10) {
		
		int reminder= num%10;
		reverse= reverse*10+reminder;}
		
		System.out.println("reverse number is...."+ reverse);
	}
	}


