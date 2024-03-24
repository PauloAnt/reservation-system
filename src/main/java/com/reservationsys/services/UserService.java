package com.reservationsys.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservationsys.entities.User;
import com.reservationsys.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository service;
	
	public List<User> findAll(){
		return service.findAll();
	}
}
