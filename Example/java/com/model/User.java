/*
 * GumBox Inc
 * (c) 2022 GumBox Inc. Viet Nam
 *
 */
package com.model;

/**
 *
 * @author falcon
 */
public class User {

	private int userID, role;
	private String username, password, fullnam, email;

	public User(int role, String username, String password, String fullnam, String email) {
		super();
		this.role = role;
		this.username = username;
		this.password = password;
		this.fullnam = fullnam;
		this.email = email;
	}

	/**
	 * @return the userID
	 */
	public int getUserID() { return userID; }

	/**
	 * @return the role
	 */
	public int getRole() { return role; }

	/**
	 * @param role the role to set
	 */
	public void setRole( int role ) { this.role = role; }

	/**
	 * @return the username
	 */
	public String getUsername() { return username; }

	/**
	 * @param username the username to set
	 */
	public void setUsername( String username ) { this.username = username; }

	/**
	 * @return the password
	 */
	public String getPassword() { return password; }

	/**
	 * @param password the password to set
	 */
	public void setPassword( String password ) { this.password = password; }

	/**
	 * @return the fullnam
	 */
	public String getFullnam() { return fullnam; }

	/**
	 * @param fullnam the fullnam to set
	 */
	public void setFullnam( String fullnam ) { this.fullnam = fullnam; }

	/**
	 * @return the email
	 */
	public String getEmail() { return email; }

	/**
	 * @param email the email to set
	 */
	public void setEmail( String email ) { this.email = email; }

}
