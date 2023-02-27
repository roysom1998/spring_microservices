package com.userservice.userservice.controller;

//import java.awt.List;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.userservice.userservice.entity.Contact;
import com.userservice.userservice.entity.User;
import com.userservice.userservice.service.userService;

@RestController
@RequestMapping("/users")
public class userController {
	
	@Autowired
	private userService userservice;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Long userId) {
		User user= this.userservice.getUser(userId);
		List contacts= this.restTemplate.getForObject("http://CONTACT-SERVICE/contacts/users/"+user.getUserId(),List.class);
		user.setContacts(contacts);
		return user;
	}

}
