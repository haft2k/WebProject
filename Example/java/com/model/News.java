/*
 * GumBox Inc
 * (c) 2022 GumBox Inc. Viet Nam
 *
 */
package com.model;

import java.sql.Date;

/**
 *
 * @author falcon
 */
public class News {

	private int newsID, categoryID, status;
	private String newsName, newsTitle, newsContent, author, imageURL;
	private Date date;

	public News(int categoryID, int status, String newsName, String newsTitle,
	        String newsContent, String author, String imageURL, Date date) {
		super();
		this.categoryID = categoryID;
		this.status = status;
		this.newsName = newsName;
		this.newsTitle = newsTitle;
		this.newsContent = newsContent;
		this.author = author;
		this.imageURL = imageURL;
		this.date = date;
	}

	public int getNewsID() { return newsID; }

	public int getCategoryID() { return categoryID; }

	public void setCategoryID( int categoryID ) { this.categoryID = categoryID; }

	public int getStatus() { return status; }

	public void setStatus( int status ) { this.status = status; }

	public String getNewsName() { return newsName; }

	public void setNewsName( String newsName ) { this.newsName = newsName; }

	public String getNewsTitle() { return newsTitle; }

	public void setNewsTitle( String newsTitle ) { this.newsTitle = newsTitle; }

	public String getNewsContent() { return newsContent; }

	public void setNewsContent( String newsContent ) { this.newsContent = newsContent; }

	public String getAuthor() { return author; }

	public void setAuthor( String author ) { this.author = author; }

	public String getImageURL() { return imageURL; }

	public void setImageURL( String imageURL ) { this.imageURL = imageURL; }

	public Date getDate() { return date; }

	public void setDate( Date date ) { this.date = date; }

}
