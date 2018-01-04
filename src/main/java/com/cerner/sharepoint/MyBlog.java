package com.cerner.sharepoint;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class MyBlog {
	
	public static final String[] coverPics = { "assets/img/profiles/cerner-cover.jpg",
			"assets/img/profiles/cerner-cover1.jpeg", "assets/img/profiles/cerner-cover-2.jpeg", "assets/img/profiles/cerner-cover3.jpeg" };


	@Id
	private String id;
	private String container;
	private String username;
	private String title;
	private String imageFilePath;
	private String body;
	private Date date=new Date();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContainer() {
		return container;
	}

	public void setContainer(String container) {
		this.container = container;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImageFilePath() {
		return Arrays.asList(coverPics).get(new Random().nextInt(coverPics.length-1));
	}

	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
}
