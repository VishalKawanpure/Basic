package com.Hello;

public class GetReverse {
	
	public static void main(String[] args) {
		int a= 1234, reverse= 0;
		
		for(;a!=0; a=a/10) {
			
			int Reminder= a %10;
			reverse= reverse*10 + Reminder;}
			
			System.out.println("Reverse is...."+ reverse);
			
		
	}

}

