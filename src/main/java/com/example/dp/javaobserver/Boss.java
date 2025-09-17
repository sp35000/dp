package com.example.dp.javaobserver;

import java.util.Observable;
import java.util.Observer;

public class Boss implements Observer {
	public Boss() {}
	public void update(@SuppressWarnings("deprecation") Observable obs, Object record) {
		System.out.println("The boss says a " + (((Database) obs).getOperation()) + " operation was performed on " + (((Database) obs).getRecord()));
	}
}
