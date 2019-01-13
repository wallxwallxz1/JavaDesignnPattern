package com.javaSession.creationnal.BuilderPattern;

import java.util.ArrayList;

public class CDType {
	
	private java.util.List<Packing> items = new ArrayList<>();
	
	public void addItem(Packing packs) {
		
		items.add(packs);
	}
	
	public void getCost() {
		for (Packing packs : items) {
			packs.price();
		}
	}
	
	public void showTems() {
		
		for (Packing packing : items) {
			
			System.out.println("CD Name: "+packing.pack());
			System.out.println("CD Price: "+packing.price());
		}
	}
}
