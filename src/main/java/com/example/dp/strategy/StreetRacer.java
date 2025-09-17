package com.example.dp.strategy;

public class StreetRacer extends Vehicle {
	
	public StreetRacer() {
		setGoAlgorithm(new GoByWalkingAlgorithm());
	}

}
