package com.example.dp.javaobserver;

import java.util.Observable;
import java.util.Observer;

public class Archiver implements Observer {
	public Archiver() {}
	public void update(@SuppressWarnings("deprecation") Observable obs, Object record) {
		System.out.println("The archiver says a " + (((Database) obs).getOperation()) + " operation was performed on " + (((Database) obs).getRecord()));
	}
}
