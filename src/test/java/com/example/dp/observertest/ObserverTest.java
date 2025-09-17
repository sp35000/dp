package com.example.dp.observertest;

import com.example.dp.observer.Archiver;
import com.example.dp.observer.Boss;
import com.example.dp.observer.Client;
import com.example.dp.observer.Database;

public class ObserverTest {
	public static void main(String args[]) {
		Database database = new Database();
		Archiver archiver = new Archiver();
		Client client = new Client();
		Boss boss = new Boss();
		
		database.registerObserver(archiver);
//		database.registerObserver(client);
//		database.registerObserver(boss);
		
		database.editRecord("add", "record 1");
		database.editRecord("update", "record 1");
		database.editRecord("delete", "record 1");
		database.editRecord("add", "record 2");
		database.editRecord("upadate", "record 2");
		database.editRecord("delete", "record 2");
		
	}
}
