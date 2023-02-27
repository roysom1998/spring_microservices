package com.contacts.service;

import java.util.List;

import com.contacts.entity.Contact;

public interface contactService {
	public List<Contact> getContactsOfUser(Long UserId);

}
