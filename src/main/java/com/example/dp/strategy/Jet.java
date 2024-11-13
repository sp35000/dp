package com.example.dp.strategy;

public class Jet extends Vehicle {
	
	public Jet() {
		setGoAlgorithm(new GoByFlyingFastAlgorithm());
	}	
}
