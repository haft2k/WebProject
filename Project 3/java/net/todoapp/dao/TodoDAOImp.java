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
import java.util.List;

import net.todoapp.model.Todo;
import net.todoapp.utils.JDBCUltils;

/**
 *
 * @author falcon
 */
public class TodoDAOImp implements TodoDAO {

	@Override
	public void insertTodo( Todo todo ) {
		String SQL = "INSERT INTO todos (title, description, target_date, username, is_done) VALUES (?, ?, ?, ?, ?)";

		try {
			Connection connection = JDBCUltils.getConnection();
			PreparedStatement preSta = connection.prepareStatement(SQL);

			/* Execute Query SQL */
			preSta.setString(1, todo.getTitle());
			preSta.setString(2, todo.getDescription());
			preSta.setDate(3, JDBCUltils.getSQLDate(todo.getTargetDate()));
			preSta.setInt(4, todo.getUsername());
			preSta.setBoolean(5, todo.getIs_done());

			preSta.executeQuery();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public Todo selectTodo( int id ) {
		String SQL = "SELECT id, username, is_done FROM todo";

		try {
			Connection connection = JDBCUltils.getConnection();
			PreparedStatement preSta = connection.prepareStatement(SQL);

			ResultSet rs = preSta.executeQuery();

		} catch (Exception e) {
			// TODO: handle exception
		}

		return null;
	}

	@Override
	public List<Todo> selectAllTodo() { return null; }

	@Override
	public boolean deleteTodo( int id ) { return false; }

	@Override
	public boolean updateTodo( Todo todo ) { return false; }

}
