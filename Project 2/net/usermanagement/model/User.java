/*
 * GumBox Inc (c) 2022 GumBox Inc. All rights reserved. address: Viet
 * Nam This software is the confidential and proprietary information
 * of GumBox, Inc ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance
 * with the terms of the license agreement you entered into with
 * GumBox
 */
package net.usermanagement.model;

/**
 *
 * @author falcon
 */
public class User {
	/*
	 * defining fields -- protected access within package and outside
	 * package but through inheritance only
	 */
	protected int id;
	protected String name, email, country;

	/* Constructor have overloading parameter */
	public User() {}

	public User(int id, String name, String email, String country) {

		this.id = id;
		this.name = name;
		this.email = email;
		this.country = country;
	}

	public User(String name, String email, String country) {
		this.name = name;
		this.email = email;
		this.country = country;
	}

	/*
	 * method setter & getter of fields
	 */
	public int getId() { return id; }

	public void setId(int id) { this.id = id; }

	public String getName() { return name; }

	public void setName(String name) { this.name = name; }

	public String getEmail() { return email; }

	public void setEmail(String email) { this.email = email; }

	public String getCountry() { return country; }

	public void setCountry(String country) { this.country = country; }

}
