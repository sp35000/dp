package com.example.dp.observertest;

import com.example.dp.javaobserver.Archiver;
import com.example.dp.javaobserver.Boss;
import com.example.dp.javaobserver.Client;
import com.example.dp.javaobserver.Database;

public class ObserverTest {
	public static void main(String args[]) {
		Database database = new Database();
		Archiver archiver = new Archiver();
		Client client = new Client();
		Boss boss = new Boss();
		
		database.registerObserver(archiver);
		database.registerObserver(client);
		database.registerObserver(boss);
		
		database.editRecord("delete", "record 1");
		
	}
}
