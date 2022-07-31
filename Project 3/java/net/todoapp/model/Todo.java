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

	public int getId() { return id; }

	public void setId( int id ) { this.id = id; }

	public int getUsername() { return username; }

	public void setUsername( int username ) { this.username = username; }

	public String getTitle() { return title; }

	public void setTitle( String title ) { this.title = title; }

	public String getDescription() { return description; }

	public void setDescription( String description ) { this.description = description; }

	public boolean getIs_done() { return is_done; }

	public void setIs_done( boolean is_done ) { this.is_done = is_done; }

	public LocalDate getTargetDate() { return targetDate; }

	public void setTargetDate( LocalDate targetDate ) { this.targetDate = targetDate; }

}
