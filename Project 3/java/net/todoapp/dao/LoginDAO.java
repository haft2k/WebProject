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
import java.sql.ResultSet;

import net.todoapp.model.LoginBean;
import net.todoapp.utils.JDBCUltils;

/**
 *
 * @author falcon
 */
public class LoginDAO {
	
	public boolean checkLogin(LoginBean user) {
		// Query set default can't result
		boolean status = false;
		String SQL = "SELECT id, username FROM users WHERE username = ? AND password = ?";
		
		// Create statement using connection object. method is static don't need call Object 
		try {
			Connection connection = JDBCUltils.getConnection();
			PreparedStatement preSta = connection.prepareStatement(SQL);
			preSta.setString(1, user.getUsername());
			preSta.setString(2, user.getPassword());
			System.out.println(preSta);
			
			// result Execute the query
			ResultSet rs = preSta.executeQuery();
			
			status = rs.next(); // next() boolean
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return status;
	}
}
