package com.example.dp.javaobserver;

public class Client implements Observer {
	public Client() {}
	public void update(String operation, String record) {
		System.out.println("The client says a " + operation + " operation was performed on " + record);
	}
}
