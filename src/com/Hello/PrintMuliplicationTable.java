package com.Hello;

public class PrintMuliplicationTable {
	
	public static void main(String[] args) {
		
		for (int i=1; i<=20; i++) {
			System.out.println("Multiplication table of  "+ i);
			
			for (int j=1; j<=10; j++) {
				
				System.out.println(i+" x "+ j+ " = "+ i*j);
			}
			System.out.println("--------------");
		}
	}

}
