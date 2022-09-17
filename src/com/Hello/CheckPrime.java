package com.Hello;
import java.util.Scanner;
public class CheckPrime {

	public static void main(String[] args) {
		int num;
		
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		
		num= sc.nextInt();
		
		for(int i=2; i<=num/2;i++) {
			if (num % i==0) {System.out.println("Non Prime");}
			//else if (num==0 || num==1){System.out.println("Non Prime");}
			else { System.out.println("Prime");}
			
		}
		
	}
}
