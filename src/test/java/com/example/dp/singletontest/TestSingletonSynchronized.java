package com.example.dp.singletontest;

import com.example.dp.singleton.DatabaseSynchronized;

public class TestSingletonSynchronized implements Runnable {
	
	Thread thread;
	
	private static void show(String instanceParm) {
		System.out.println("This is the " + instanceParm + " database");
	}
	
	public static void main(String args[]) {
		DatabaseSynchronized database;
		database = DatabaseSynchronized.getInstance("products");
		show(database.getName());
		database = DatabaseSynchronized.getInstance("employees");
		show(database.getName());
	}

	@Override
	public void run() {
	}
	

}
