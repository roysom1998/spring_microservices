package com.userservice.userservice.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.domain.EntityScan;

public class User {
	private Long userId;
	private String name;
	private String mobile;
	List<Contact> contacts=new ArrayList<>();
	
	public User(Long userId, String name, String mobile, List<Contact> contacts) {
		super();
		this.userId = userId;
		this.name = name;
		this.mobile = mobile;
		this.contacts = contacts;
	}

	public User(Long userId, String name, String mobile) {
		super();
		this.userId = userId;
		this.name = name;
		this.mobile = mobile;
	}

	public User() {
		super();
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
}
