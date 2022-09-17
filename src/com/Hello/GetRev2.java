package com.Hello;

public class GetRev2 {
	
	
	
	public static void main(String[]args) {
		int number=1234; 
				int reverse=0;
		
		for(;number!=0; number=number/10) {
			int reminder= number%10;
			reverse= reverse* 10 + reminder;}
			
			
			{System.out.println("reverse number is ...."+ reverse);
		}
	}

}
