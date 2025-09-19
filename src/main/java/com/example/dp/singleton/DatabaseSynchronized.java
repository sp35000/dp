package com.example.dp.singleton;

public class DatabaseSynchronized {
	
	private static DatabaseSynchronized singleObject;
	private int record;
	private String name;
	
	private DatabaseSynchronized(String n)
	{
	setName(n);
	setRecord(0);
	}
	
	public static synchronized DatabaseSynchronized getInstance(String n) {
		if (singleObject == null) {
			singleObject = new DatabaseSynchronized(n);
		}
		return singleObject;
	}
	
	public void editRecord(String operation)
	{
		System.out.print("Performing a " + operation + " operation on record " + record +	" in database " + name);
	}

	public int getRecord() {
		return record;
	}

	public void setRecord(int record) {
		this.record = record;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
