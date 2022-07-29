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
package net.todoapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import net.todoapp.model.User;
import net.todoapp.utils.JDBCUltils;

/**
 *
 * @author falcon
 */
public class UserDAO {

	public int registerUser(User user) {
		int result = 0;
		String INSERT_USERS_SQL = "INSERT INTO users(first_name, last_name, username, password) VALUES (?, ?, ?, ?)";

		try {
			Connection connection = JDBCUltils.getConnection();
			PreparedStatement preSta = connection.prepareStatement(INSERT_USERS_SQL);
			preSta.setString(1, user.getFirstName());
			preSta.setString(2, user.getLastName());
			preSta.setString(3, user.getUsername());
			preSta.setString(4, user.getPassword());
			
			result = preSta.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return result;
	}

}
