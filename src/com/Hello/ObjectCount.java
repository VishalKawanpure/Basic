package com.Hello;

public class ObjectCount {
	
	public static int count;
	
	public ObjectCount(){
		
		count++;
	}

	public static void main(String[]args){
		
		ObjectCount ob1=new ObjectCount();
		ObjectCount ob2=new ObjectCount();
		//ObjectCount ob3=new ObjectCount();
		
		System.out.println("Object count="+ ObjectCount.count);
		
		
		
	}
}
