package com.Hello;

public class ObCount {
	
	public static int count;
	
	public ObCount() {
		count++;
	}
	public static void main(String[] args) {
		
		ObCount ob1=new ObCount();
		//ObCount ob2= new ObCount();
		
		System.out.println(ObCount.count);
	}

}
