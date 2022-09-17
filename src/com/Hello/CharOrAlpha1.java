package com.Hello;

import java.util.Scanner;

public class CharOrAlpha1 {
	
	public static void main(String[] args) {
		
		char character;
		
		System.out.println("Enter the Character");
		
		Scanner sc= new Scanner(System.in);
		character=sc.next().charAt(0);
		
if((character >=65 && character<= 90)||(character>=97 && character<=122)) { System.out.println("Is Character");}
		
		else if (character>= 48 && character <= 57) { System.out.println("Is number");}
		
		else { System.out.println(character+"is special character");}
	}

}
