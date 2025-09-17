/**
 * 
 */
package com.example.dp.strategy;

/**
 * 
 */
public abstract class Vehicle {
	
	private IGoAlgorithm goAlgorithm;
	public Vehicle() {}
	public void setGoAlgorithm(IGoAlgorithm algorithm) {
		goAlgorithm = algorithm;
	}
	public void go() {
		goAlgorithm.go();
	}

}