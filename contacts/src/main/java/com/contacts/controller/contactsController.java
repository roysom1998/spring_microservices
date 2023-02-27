package com.contacts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contacts.entity.Contact;
import com.contacts.service.contactService;

@RestController
@RequestMapping("/contacts")
public class contactsController {

	@Autowired
	public contactService contactservice;
	@RequestMapping("/users/{userId}")
	public List<Contact> getContacts(@PathVariable("userId") Long userId){
		return this.contactservice.getContactsOfUser(userId);
	}
}
