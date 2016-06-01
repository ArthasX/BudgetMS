package com.budgetms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlUtil {

	private static String username = "root";
	private static String password = "root";
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:MySQL://localhost:3306/ysgl";

	public static Connection getConnection() throws InstantiationException,
			IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName(driver).newInstance();
		return DriverManager.getConnection(url, username, password);
	}
	
	
}
