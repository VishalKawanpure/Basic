package com.Hello;

public class Tab {
	
	public static void main(String[] args) {
		
		for (int i=2; i<=20; i++) {
			System.out.println("Table of .."+ i);
			for (int j=1; j<=10; j++) {
				
				System.out.println(i+" x " +j+"=" +i*j);
				
			}
			System.out.println("================");
		}
	}

}
