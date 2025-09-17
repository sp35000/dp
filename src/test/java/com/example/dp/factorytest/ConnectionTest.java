package com.example.dp.factorytest;

import com.example.dp.factory.Connection;
import com.example.dp.factory.FirstFactory;

public class ConnectionTest {
	public static void main(String args[]) {
		FirstFactory factory,factory2,factory3;		
		factory = new FirstFactory("Oracle");
		Connection connection = factory.createConnection();
		System.out.println("You're connecting with " + connection.description());		
		factory2 = new FirstFactory("SqlServer");
		Connection connection2 = factory2.createConnection();
		System.out.println("You're connecting with " + connection2.description());		
		factory3 = new FirstFactory("MySql");
		Connection connection3 = factory3.createConnection();
		System.out.println("You're connecting with " + connection3.description());		
	}
}
