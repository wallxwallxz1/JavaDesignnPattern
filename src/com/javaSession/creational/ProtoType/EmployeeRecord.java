package com.javaSession.creational.ProtoType;

public class EmployeeRecord implements Prototype{
	
	private int id;
	private String name, designation, address;
	private double salary;

	@Override
	public Prototype getClone() {
		
		/*
		 * the get clone method return an instance of this class 'EmployeeRecord '
		 * N.B. it a call to the constructor (constructor with parameter) of this class 
		 */
		return new EmployeeRecord(id, name, designation, address, salary);
		
	}

	public EmployeeRecord(int id, String name, String designation, String address, double salary) {
		
		// Constructor with parameter
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.address = address;
		this.salary = salary;
	}

	public EmployeeRecord() {
		
		//Constructor without parameter  
		
		super();
		System.out.println("                    Employee Records of Oracle Corporation                     ");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println(" E id: "+"\t"+"E name:	"+"\t"+"designation:  "+"\t"
							+"address  "+"\t"+"salary  "+"\t");
	}
	
	public void showRecord() {
		new EmployeeRecord();
		System.out.println(id +"\t"+ name+"\t"+designation+"\t"+address+"\t"+salary+"\t");
	}
}
