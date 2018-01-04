package com.cerner.sharepoint;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Group {

	public static final String[] coverPics = { "assets/img/profiles/cerner-cover.jpg",
			"assets/img/profiles/cerner-cover1.jpeg", "assets/img/profiles/cerner-cover-2.jpeg", "assets/img/profiles/cerner-cover3.jpeg" };

	@Id
	private String id;
	private String name;
	private String description;
	private String members;
	private Integer followers = new Random().nextInt(50);
	private Date date=new Date();
	private String imageFilePath;

	public String getImageFilePath() {
		return Arrays.asList(coverPics).get(new Random().nextInt(coverPics.length-1));
	}

	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}

	public Integer getFollowers() {
		return followers;
	}

	public void setFollowers(Integer followers) {
		this.followers = followers;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getMembers() {
		return members;
	}

	public void setMembers(String members) {
		this.members = members;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
