package com.example.dp.javaobserver;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class Database extends Observable {
	
	public String operation;
	public String record;
	
	public Database() {	}
	
	public void editRecord(String operation, String record) {
		this.operation = operation;
		this.record = record;
		setChanged();
		notifyObservers();
	}
	
	public String getRecord() {
		return record;
	}

	public String getOperation() {
		return operation;
	}
		
	
}
