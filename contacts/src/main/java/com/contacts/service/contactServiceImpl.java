package com.contacts.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contacts.entity.Contact;

@Service
public class contactServiceImpl implements contactService{
	
	List<Contact> list=List.of(
			new Contact(1L,"abc@fakemail.com","abc",1311L),
			new Contact(2L,"dce@fakemail.com","dce",1312L)
			);

	@Override
	public List<Contact> getContactsOfUser(Long UserId) {
		// if the given user id is equal to the user id in list then return the object of contact
		return list.stream().filter(contact->contact.getUserId().equals(UserId)).collect(Collectors.toList());
	}

}
