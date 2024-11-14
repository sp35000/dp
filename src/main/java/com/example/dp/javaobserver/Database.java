package com.example.dp.javaobserver;

import java.util.*;

public class Database implements Subject {
	
	private Vector<Observer> observers;
	public String operation;
	public String record;
	
	public Database() {
		observers = new Vector<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);		
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}
	
	public void editRecord(String operation, String record) {
		this.operation = operation;
		this.record = record;
		notifyObservers();
	}

	private void notifyObservers() {
		for (int loopIndex =0; loopIndex < observers.size(); loopIndex++) {
			Observer observer = (Observer)observers.get(loopIndex);
			observer.update(operation, record);			
		}		
	}

	@Override
	public void notifyObserver(Observer o) {
		// TODO Auto-generated method stub
		
	}
}
