package com.example.dp.javaobserver;

public class Archiver implements Observer {
	public Archiver() {}
	public void update(String operation, String record) {
		System.out.println("The archiver says a " + operation + " operation was performed on " + record);
	}
}
