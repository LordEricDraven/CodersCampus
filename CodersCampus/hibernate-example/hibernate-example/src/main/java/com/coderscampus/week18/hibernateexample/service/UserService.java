package com.coderscampus.week18.hibernateexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.week18.hibernateexample.domain.User;
import com.coderscampus.week18.hibernateexample.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public List<User> findAll (){
		return userRepo.findAll();
	}

}
