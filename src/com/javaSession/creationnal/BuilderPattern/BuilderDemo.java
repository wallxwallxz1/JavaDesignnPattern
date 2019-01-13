package com.javaSession.creationnal.BuilderPattern;

public class BuilderDemo {
	
	public static void main(String[] args) {
		
		CDBuilder cdBuilder = new CDBuilder();
		
		CDType cdType1 = cdBuilder.buildSamsungCD();
		cdType1.showTems();
		
		System.out.println();
		
		CDType cdType2 = cdBuilder.buildSonyCD();
		cdType2.showTems();
	}
}
