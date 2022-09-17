package com.Hello;
import java.util.Scanner;
public class PNumber {

	public static void main(String[] args) {
		
		int num;
		System.out.println("Enter the Number");
		
		Scanner sc= new Scanner(System.in);
		
		num= sc.nextInt();
		sc.close();
		//if (num==0|| num==1){ System.out.println("Non Prime");})
		for(int i=2; i<=num/2; i++) {
			if (num % i ==0) { System.out.println("Non Prime");}
			else { System.out.println("Prime");}
			
			
		}
	}
}
