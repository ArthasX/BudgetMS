package com.budgetms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB2Util {

	private static String username = "db2inst1";
	private static String password = "db2inst1";
	private static String driver = "com.ibm.db2.jcc.DB2Driver";
	private static String url = "jdbc:db2://160.100.103.200:50000/IG";

	public static Connection getConnection() throws InstantiationException,
			IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName(driver).newInstance();
		return DriverManager.getConnection(url, username, password);
	}
	
	
}
