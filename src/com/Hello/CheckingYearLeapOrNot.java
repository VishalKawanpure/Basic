package com.Hello;

public class CheckingYearLeapOrNot {
	public static void main(String[]args) {
		int year= 2020;
		if ((year%4 ==0) && (year%100 !=0) ){ System.out.println("Year is leap");}
		
		else {System.out.println("Not leap year");
		}
}}
