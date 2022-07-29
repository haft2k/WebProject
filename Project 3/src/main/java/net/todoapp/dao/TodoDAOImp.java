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

import java.util.List;

import net.todoapp.model.Todo;


/**
 *
 * @author falcon
 */
public class TodoDAOImp implements TodoDAO {

	@Override
	public void insertTodo(Todo todo) {
		String SQL = "INSERT";
	}

	@Override
	public Todo selectTodo() { return null; }

	@Override
	public List<Todo> selectAllTodo() { return null; }

	@Override
	public boolean deleteTodo(int id) { return false; }

	@Override
	public boolean updateTodo(Todo todo) { return false; }

}
