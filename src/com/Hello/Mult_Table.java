package com.Hello;
import java.util.Scanner;

public class Mult_Table {

	public static void main(String[] args) {
		
		int num;
		System.out.println("Enter the number");
		
		Scanner sc= new Scanner(System.in);
		num= sc.nextInt();
		
		System.out.println("Multiplication table for " +num+ " is");
		
		for(int i=1; i<=10; i++) {
			
			System.out.println(num*i);
			//System.out.printformat("%d x %d = %d" num;, i, num*i)
		}
	}
}
