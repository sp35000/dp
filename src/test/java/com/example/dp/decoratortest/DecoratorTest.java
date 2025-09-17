package com.example.dp.decoratortest;

import com.example.dp.decorator.CD;
import com.example.dp.decorator.Computer;
import com.example.dp.decorator.Disk;
import com.example.dp.decorator.Monitor;

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
