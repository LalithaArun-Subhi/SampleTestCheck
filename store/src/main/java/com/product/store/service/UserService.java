package com.product.store.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.store.dao.UserDetails;
import com.product.store.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public void saveData(UserDetails user) {
		userRepo.save(user);
	}
	
	public UserDetails getUserData(int id) {
		return userRepo.findById(Long.valueOf(id)).get();
	}

	public UserDetails vaildUser(String userName,String password) {
		return userRepo.validUser(userName, password);
	}
}
