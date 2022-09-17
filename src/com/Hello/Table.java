package com.Hello;

public class Table {
	public static void main(String[] args) {
		
		int tablesize= 20;
		
		//for (int i=1; i<=10; i++) {
		//	System.out.print(i);
		//}
		
		for (int i=1; i<=20; i++) {
			System.out.println("table of "+i);
			for (int j=1; j<=10; j++) {
				System.out.println(i+ " x " +j+ "="+ (i*(j)));
			}
			
			System.out.println("-------------");
		}
	}

}
