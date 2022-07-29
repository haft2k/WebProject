/*
 * GumBox Inc
 * (c) 2022 GumBox Inc. Viet Nam
 *
 * This software is the confidential and proprietary
 * information of GumBox, Inc
 * ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with GumBox
 */
package net.todoapp.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author falcon
 */
public class JDBCUltils {

	private static String URL = "jdbc:mysql/localhost:3306/";
	private static String DATABASE = "todoapp?useSSL=false";
	private static String USERNAME = "root";
	private static String PASSWORD = "root";

	public JDBCUltils() {}

	/*
	 * Driver Connection to database
	 * 
	 * @return Connection
	 */
	public static Connection getConnection() {
		Connection connection = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(URL + DATABASE, USERNAME, PASSWORD);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return connection;
	}

	public static void printSQLException(SQLException sqlEx) {
		
	}
}
