package com.Hello;

public class Countobject {
	
	public static int Count;
	
	public Countobject(){
		
		Count++;
	}
	
	public static void main(String []args) {
		
		Countobject ob1=new Countobject();
		Countobject ob2=new Countobject();
		Countobject ob3=new Countobject();
		
		System.out.println("Total number of object...."+ Countobject.Count );
	
		

}}
