package com.Hello;

public class CountOb {
	
	static int count;
	
	public CountOb() {
		
		count++;
	}
	public static void main(String[] args) {
		
		CountOb ob1= new CountOb();
		CountOb ob2= new CountOb();
		
	  
	
	System.out.println(count);

}}
