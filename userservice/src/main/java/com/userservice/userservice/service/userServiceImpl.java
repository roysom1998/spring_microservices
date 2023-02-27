package com.userservice.userservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.userservice.userservice.entity.User;


@Service

public class userServiceImpl implements userService {
	
	List<User> list=List.of(
			new User(1311L,"abc","9999999999"),
			new User(1312L,"dce","7777777777")
			);

	@Override
	public User getUser(Long id) {

		return list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
	}

}
