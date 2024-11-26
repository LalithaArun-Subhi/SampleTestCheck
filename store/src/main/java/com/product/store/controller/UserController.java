package com.product.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.store.dao.UserDetails;
import com.product.store.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping(value="/api/saveUserData")
	public void saveUserData(@RequestBody UserDetails user) {
		log.info("User details are saved sucessfully");
		userService.saveData(user);
		log.warn("After run the user save method");
	}
	
	@GetMapping(value="/api/getDataById/{id}")
	public UserDetails getUserDetails(@PathVariable int id) {
		log.info("Get user details by user id");
		return userService.getUserData(id);
	}
	
	@GetMapping(value="/api/validUser")
	public UserDetails validUser(@RequestParam("UserName") String userName,@RequestParam("Password") String pwd)
	{
		log.info("Validate valid user or not");
		return userService.vaildUser(userName, pwd);
	}

}
