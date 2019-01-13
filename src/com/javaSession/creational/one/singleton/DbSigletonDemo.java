package com.javaSession.creational.one.singleton;

public class DbSigletonDemo {

	public static void main(String[] args) {
		
		/*
		 * Calling DbSingleton class instead of creating a instance with 
		 * new DbSingleTon() constructor we use the DbSingleton getInstace()
		 */
		
		DbSingleton instance1 = DbSingleton.getInstace();
		System.out.println("The is from hashCode is from instance1: "+instance1);
		System.out.println();
		
		DbSingleton instance2 = DbSingleton.getInstace();
		System.out.println("The is from hashCode is from instance2: "+instance2);
		
		if(instance1 == instance2) {
			
			System.out.println("The instance Hash code are Same: \n"
					
					+"HashCode instance1: "+instance1.hashCode()
					
					+"\n"+"hashCodeinstance2 : "+instance2.hashCode());
			
			System.out.println();
				
		}else {
			
			System.out.println("The are not the same ");
			
		}
	}

}
