package com.example.dp.Decorator;

public class CD extends ComputerDecorator {
	Computer computer;
	
	public CD(Computer c)
	{
		computer = c;
	}
	
	public String description() {
		return computer.description() + " and a CD";
	}	

}