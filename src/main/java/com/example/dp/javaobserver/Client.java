package com.example.dp.javaobserver;

import java.util.Observable;
import java.util.Observer;

public class Client implements Observer {
	public Client() {}
	public void update(@SuppressWarnings("deprecation") Observable obs, Object record) {
		System.out.println("The client says a " + (((Database) obs).getOperation()) + " operation was performed on " + (((Database) obs).getRecord()));
	}
}
