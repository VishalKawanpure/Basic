package com.Hello;

public class Arrr {
	
	public static void main(String[] args) {
		int sum1= 0;
		int sum2= 0;
		int a[]= { 10, 20, 30, 40,50, 60,80};
		
		for ( int i =0; i<a.length; i++) {
			
			sum1=sum1+ a[i];
			}
		System.out.println(sum1);
		
		for (int j=1; j<=8; j++) {
		    
			sum2= sum2+ (j*10); }
		
		System.out.println(sum2);
		
		System.out.println("missing number>>>>"+ (sum2-sum1));
	}
}
