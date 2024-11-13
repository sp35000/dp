package com.example.dp.Decorator;

public class Monitor extends ComputerDecorator {
	Computer computer;
	
	public Monitor(Computer c)
	{
		computer = c;
	}
	
	public String description() {
		return computer.description() + " and a monitor";
	}	

}
