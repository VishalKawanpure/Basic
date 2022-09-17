package com.Hello;



public class Alpha_Or_Char {

	public static void main (String[]args) {
		char name = 5 ;
		
		if((name>=  65 &&  name<= 90)|| (name>= 97 && name<=122 )) { System.out.println("Veriable is character");}
		
		else if (name >=48 && name <=57) {System.out.println(" Veriable is number");}
		
		else { System.out.println("Veriable is special character");}
		
	}
}
