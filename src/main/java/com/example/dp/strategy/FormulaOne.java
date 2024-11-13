package com.example.dp.strategy;

public class FormulaOne extends Vehicle {
	public FormulaOne() {
		setGoAlgorithm(new GoByDrivingAlgorithm());
	}
}
