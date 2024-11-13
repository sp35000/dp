package com.example.dp.Decorator;

public class Disk extends ComputerDecorator {
	Computer computer;
	
	public Disk(Computer c)
	{
		computer = c;
	}
	
	public String description() {
		return computer.description() + " and a disk";
	}	

}
