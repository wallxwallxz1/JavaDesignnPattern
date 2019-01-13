package com.javaSession.creational.ProtoType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeRecordDemo {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter an Employee id: ");
		int eid = Integer.parseInt(br.readLine());
		System.out.println("\n");
		
		System.out.println("Enter an Employee Name: ");
		String ename = br.readLine();
		System.out.println("\n");
		
		System.out.println("Enter an Employee Designnation: ");
		String edesgination = br.readLine();
		System.out.println("\n");
		
		System.out.println("Enter an Employee Adress: ");
		String eaddress = br.readLine();
		System.out.println("\n");
		
		System.out.println("Enter an Employee Salary: ");
		double esalary = Double.parseDouble(br.readLine());
		System.out.println("\n");
		
		/*
		 * Create an instance of EmployeeRecord and passing the parameter from line 11 - 28
		 * line 37 call the show method of EmployeeRocord
		 */
		EmployeeRecord e1 = new EmployeeRecord(eid, ename, edesgination, eaddress, esalary);
		e1.showRecord();
		System.out.println("\n");
		
		/*
		 * Here we create a variable e2 of type EmployeeRecord and assign a copy of e1 to it
		 * thank to clone method of interface Prototype which was override in the EmployeeRecord class.
		 */
		EmployeeRecord e2 = (EmployeeRecord) e1.getClone();
		e2.showRecord();
		
		/*use this to test about e2*/
		int id = 10;
		String name = "wall";
		String designation =" manager";
		String address = "5995 st";
		double salary = 48979;
		
		
	}

}
