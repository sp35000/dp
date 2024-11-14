package com.example.dp.javaobserver;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver(Observer o);
}
