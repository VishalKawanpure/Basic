package com.Hello;
import java.util.Scanner;
public class CheckingYearLeapOrNotEx2 {
	public static void main (String[]args) {
		int year;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the year");
		
		year=sc.nextInt();
		
		if ((year%4==0)&& (year%100!=0)) {System.out.println("Year is leap");
		}
		else { System.out.println("year is not leap");
	}

}}
