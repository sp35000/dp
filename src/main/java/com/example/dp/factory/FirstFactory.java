package com.example.dp.factory;

public class FirstFactory {

	protected String type;
	
	public FirstFactory(String t) {
		type = t;
	}
	
	public Connection createConnection() {
		if (type.equals("Oracle")) {
			return new OracleConnection();
		}
		if (type.equals("SqlServer")) {
			return new SqlServerConnection();
		}
		if (type.equals("MySql")) {
			return new MySqlConnection();
		}
		return null;
	}

}
