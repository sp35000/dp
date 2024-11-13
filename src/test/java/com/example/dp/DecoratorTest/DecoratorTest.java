package com.example.dp.DecoratorTest;

import com.example.dp.Decorator.CD;
import com.example.dp.Decorator.Computer;
import com.example.dp.Decorator.Disk;
import com.example.dp.Decorator.Monitor;

public class DecoratorTest {
	public static void main(String args[]) {
		Computer computer = new Computer();		
		computer = new Disk(computer);
		computer = new Monitor(computer);
		computer = new CD(computer);
		computer = new CD(computer);
		System.out.println("You're getting a " + computer.description() + ".");
	}
}
