package com.Hello;

import java.util.Scanner;

public class Employee {
	
	public static void getUserInput() {
		
		System.out.println("Enter Employee First name>>>");
		Scanner sc= new Scanner(System.in);
		String Firstname =sc.next();
		System.out.println("Enter Employee Last name>>>");
		String Lastname= sc.next();
		System.out.println("Enter Employee City name>>>");
		String Employeecity=sc.next();
		System.out.println("Enter Employee Country>>>");
		String EmployeeCountry= sc.next();
		System.out.println("Enter Employee mobileNumber >>>");
		int mobileNumber=sc.nextInt();
		
	/*	Employee employee= new Employee();
		employee.setEmployeeFirstName(Firstname);
		employee.setEmployeeLastName(Lastname);
		employee.setEmployeeCitytName(Employeecity);
		employee.setEmployeeCountryName(EmployeeCountry);
		employee.setEmployeeMobileNumberName(mobileNumber);
		
		System.out.println("Employee First name>>>"+employee.getEmployeeFirstName());
		System.out.println("Employee Last name>>>"+employee.getEmployeeLastName());
		System.out.println("Employee City name>>>"+employee.getEmployeeCityName());
		System.out.println("Employee Country name>>>"+employee.getEmployeeCountryName());
		System.out.println("Employee Last name>>>"+employee.getEmployeeMobileNumberName());
	}
	public static void main(String[] args) {
		
		getUserInput(); */
		
	}
}
