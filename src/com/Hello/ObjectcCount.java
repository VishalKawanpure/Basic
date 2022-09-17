package com.Hello;

public class ObjectcCount {
	
		public static int count;
		
		public ObjectcCount() {
			count ++; }
		public static void main(String[] args) {
			
			ObjectcCount ob1=new ObjectcCount();
			ObjectcCount ob2= new ObjectcCount();
			
			System.out.println(ObjectcCount.count);
		}
	

}
