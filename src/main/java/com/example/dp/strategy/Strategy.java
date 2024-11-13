package com.example.dp.strategy;

public class Strategy {

	public static void main(String[] args) {
		StreetRacer streetRacer = new StreetRacer();
		FormulaOne formulaOne = new FormulaOne();
		Helicopter helicopter = new Helicopter();
		Jet jet = new Jet();
		
		System.out.print("streetRacer: ");
		streetRacer.go();
		System.out.print("formulaOne: ");
		formulaOne.go();
		System.out.print("helicopter: ");
		helicopter.go();
		System.out.println("=== jet ===");
		jet.setGoAlgorithm(new GoByDrivingAlgorithm());
		jet.go();		
		jet.setGoAlgorithm(new GoByFlyingFastAlgorithm());
		jet.go();		
		jet.setGoAlgorithm(new GoByDrivingAlgorithm());
		jet.go();		
	}

}
