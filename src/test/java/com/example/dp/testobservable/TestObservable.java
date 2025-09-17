package com.example.dp.testobservable;

import com.example.dp.javaobserver.Archiver;
import com.example.dp.javaobserver.Boss;
import com.example.dp.javaobserver.Client;
import com.example.dp.javaobserver.Database;

public class TestObservable {

	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		
		Database database = new Database();
		
		Archiver archiver = new Archiver();
		Client client = new Client();
		Boss boss = new Boss();
		
		database.addObserver(archiver);
		database.addObserver(client);
		database.addObserver(boss);
		
		database.editRecord("delete", "record 1");
	}

}
