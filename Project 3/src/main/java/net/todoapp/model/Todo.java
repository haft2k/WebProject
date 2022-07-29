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
package net.todoapp.model;

import java.time.LocalDate;

/**
 *
 * @author falcon
 */
public class Todo {

	private int id, username;
	private String title, description;
	private boolean is_done;
	private LocalDate targetDate; // local date time immutable

	public Todo(int id, int username, String title, String description, boolean is_done, LocalDate targetDate) {
		super();
		this.id = id;
		this.username = username;
		this.title = title;
		this.description = description;
		this.is_done = is_done;
		this.targetDate = targetDate;
	}

	/**
	 * @return the id
	 */
	public int getId() { return id; }

	/**
	 * @return the username
	 */
	public int getUsername() { return username; }

	/**
	 * @param username the username to set
	 */
	public void setUsername(int username) { this.username = username; }

	/**
	 * @return the title
	 */
	public String getTitle() { return title; }

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) { this.title = title; }

	/**
	 * @return the description
	 */
	public String getDescription() { return description; }

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) { this.description = description; }

	/**
	 * @return the is_done
	 */
	public boolean isStatus() { return is_done; }

	/**
	 * @param is_done the is_done to set
	 */
	public void setStatus(boolean is_done) { this.is_done = is_done; }

	/**
	 * @return the targetDate
	 */
	public LocalDate getTargetDate() { return targetDate; }

	/**
	 * @param targetDate the targetDate to set
	 */
	public void setTargetDate(LocalDate targetDate) { this.targetDate = targetDate; }

}
