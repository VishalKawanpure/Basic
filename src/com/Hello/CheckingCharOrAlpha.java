package com.Hello;
import java.util.Scanner;

public class CheckingCharOrAlpha {
	
	public static void main( String [] args) {
		
		
		char name ;
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println(" Enter the name");
		
		name= sc.next().charAt(0);
		
		if((name >=65 && name<= 90)||(name>=97 && name<=122)) { System.out.println("Is Character");}
		
		else if (name>= 48 && name <= 57) { System.out.println("Is number");}
		
		else { System.out.println("is special character");}
	}
	
	

}
