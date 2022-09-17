package com.Hello;

public class CharOrAlpha {
	
	public static void main(String[] args) {
		
		char name= 'v';
		
		if ((name>='a' && name<='z') || (name >='A' && name<='Z')) {
			System.out.println("Character is alphabet");}
		
		else if (name>=0 && name <=9) { System.out.println("Character is digit");}
		
		else { System.out.println("Character is special symbol");
		}
	}

}
