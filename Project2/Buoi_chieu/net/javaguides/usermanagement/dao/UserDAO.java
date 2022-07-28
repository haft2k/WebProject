/*
 * GumBox Inc
 * (c) 2022 GumBox Inc. All rights reserved.
 * address: Viet Nam
 * This software is the confidential and proprietary
 * information of GumBox, Inc
 * ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it
 * only in
 * accordance with the terms of the license agreement you
 * entered into
 * with GumBox
 */
package net.javaguides.usermanagement.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import net.javaguides.usermanagement.model.User;


/**
 *
 * @author falcon
 */
public class UserDAO {
	private String URL = "jdbc:mysql://localhost:3306/";
	private String DATABASE = "demo";
	private String USERNAME = "root";
	private String PASSWORD = "root";

	private static final String SELECT_ALL_USERS = "SELECT * FROM users";
	private static final String INSERT_USERS_SQL = "INSERT INTO users" + " (name, email, country) VALUES" + "(?,?,?);";
	private static final String SELECT_USERS_BY_ID = "SELECT id,name,email,country FROM users WHERE id =?";
	private static final String DELETE_USERS_SQL = "DELETE FROM users WHERE id = ?;";
	private static final String UPDATE_USERS_SQL = "UPDATE users SET name =?,email = ?,country=? WHERE id = ?;";

	public UserDAO() {}

	protected Connection getConnection() {

		Connection connection = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(URL + DATABASE, USERNAME, PASSWORD);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return connection;
	}

	public void insertUser(User u) {

		try {

			/* Step 1: Establishing a Connection */
			Connection connection = getConnection();

			/* Step 2: Create a statement using connection object */
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);
			preparedStatement.setString(1, u.getName());
			preparedStatement.setString(2, u.getEmail());
			preparedStatement.setString(3, u.getCountry());

			int rs = preparedStatement.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public User selectUser(int id) {

		User user = new User();

		try {
			/* Step 1: Establishing a Connection */
			Connection connection = getConnection();

			/* Step 2: Create a statement using connection object */
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USERS_BY_ID);
			preparedStatement.setInt(1, id);

			/* Step 3: Execute the query or update query */
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setCountry(rs.getString("country"));

			}

			return user;

		} catch (Exception e) {
			// TODO: handle exception
		}

		return null;
	}

	public List<User> selectAllUsers() {

		List<User> lstUsers = new ArrayList<>();

		try {
			/* Step 1: Establishing a Connection */
			Connection connection = getConnection();

			/* Step 2: Create a statement using connection object */
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);
			System.out.println(preparedStatement);

			/* Step 3: Execute the query or update query */
			ResultSet rs = preparedStatement.executeQuery();

			/* Step 4: Process the ResultSet object */
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String country = rs.getString("country");

				lstUsers.add(new User(id, name, email, country));

			}
			connection.close();
			return lstUsers;

		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	public boolean deleteUser(int id) {

		boolean rowDeleted = false;

		try {
			/* Connection to databse */
			Connection connection = getConnection();

			/* Statement using connection object */
			PreparedStatement pSta = connection.prepareStatement(DELETE_USERS_SQL);

			/* Excute query or update */
			pSta.setInt(1, id);

			rowDeleted = pSta.executeUpdate() > 0;
		} catch (Exception e) {
			// printStackTrace(): handle exception
			e.printStackTrace();
		}

		return rowDeleted;
	}

	public boolean updateUser(User u) {

		try {
			/* Connection */
			Connection connection = getConnection();
			PreparedStatement pSta = connection.prepareStatement(UPDATE_USERS_SQL);
			pSta.setString(1, "name");
			pSta.setString(1, "email");
			pSta.setString(1, "country");

			pSta.executeUpdate();

		} catch (Exception e) {
			// printStackTrace(): handle exception
			e.printStackTrace();
		}
		return false;
	}

	public void printSQLException(SQLException e) {

	}
}
