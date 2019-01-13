package com.javaSession.creational.one.singleton;

public class SinngletonEverydayDemo {
	
	public static void main(String[] args) {
		
		Runtime singletonRuntime = Runtime.getRuntime();
		
		singletonRuntime.gc();  // garbage collection 
		
		System.out.println("This is singletonRuntime: "+ singletonRuntime);
		
		Runtime anotherInstance = Runtime.getRuntime();
		
		System.out.println("This is anotherInstance: "+ anotherInstance);
		
		if (singletonRuntime==anotherInstance) {
			
			System.out.println("They are the same instance");
			
		}else {
			
			System.out.println("They are NOT same instance");
			
		}
	}
}
