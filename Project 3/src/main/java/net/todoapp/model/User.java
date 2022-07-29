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


/**
 *
 * @author falcon
 */
public class User {

	private int id;
	private String firstName, lastName, username, password;

	public User(int id, String firstName, String lastName, String username, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
	}


	public String getFirstName() { return this.firstName; }


	public String getLastName() { return lastName; }


	public void setLastName(String lastName) { this.lastName = lastName; }


	public String getUsername() { return username; }


	public void setUsername(String username) { this.username = username; }


	public String getPassword() { return password; }


	public void setPassword(String password) { this.password = password; }


	public void setFirstName(String firstName) { this.firstName = firstName; }


	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", username=" + username
		        + ", password=" + password + "]";
	}


}
