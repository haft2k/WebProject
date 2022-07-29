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
public class LoginBean {

	private String username, password;

	public LoginBean(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


	public String getUsername() { return username; }


	public void setUsername(String username) { this.username = username; }


	public String getPassword() { return password; }


	public void setPassword(String password) { this.password = password; }

	@Override
	public String toString() { return "LoginBean [userName=" + username + ", passWord=" + password + "]"; }

}
