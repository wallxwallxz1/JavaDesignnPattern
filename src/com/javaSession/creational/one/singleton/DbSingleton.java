package com.javaSession.creational.one.singleton;

public class DbSingleton {
	
	/*
	 	Singleton class has a private constructor 
	 	and in other for an instance of the class to accessible to 
	 	their class that instance has to static as below
	*/
	
	// volatile is data type and can only be read by memory and is thread safe
	
	private static volatile DbSingleton instance = null;
	
	private DbSingleton() {
		// private constructor with private modifier
		
		}
	
	public static DbSingleton getInstace() {
		/*
		 * public method to get an an instance of DbSigleton 
		 * Note it is a static method thus can be called from another 
		 * class without creating an instance of DbSingleton
		 * 
		 */ 
		

		if (instance == null){
			
			instance = new DbSingleton();
		}
		
		return instance;
	}
}
