package com.Hello;

public class Mis {
public static void main(String[] args) {
	

	int a[]= {1,1,2,2,3,4,5,6,7,7,8};
	
	int b= a.length;
	
	for(int i= 0; i<b; i++) {
		
		for(int j=i+1; j<b;j++) {
			
			if(a[i]==a[j]) {
				
				System.out.println(a[j]);
			}
	}
	
	

}}}
