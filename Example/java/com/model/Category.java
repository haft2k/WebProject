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
public class Category {

	private int categoryID;
	private String categoryName;

	public Category(int categoryID, String categoryName) {
		super();
		this.categoryID = categoryID;
		this.categoryName = categoryName;
	}

	public int getCategoryID() { return this.categoryID; }

	public void setCategoryName( String categoryName ) {
		this.categoryName = categoryName;
	}

	public String getCategoryName() { return this.categoryName; }
	
	
}
