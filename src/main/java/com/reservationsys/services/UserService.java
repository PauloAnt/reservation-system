package com.reservationsys.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservationsys.entities.User;
import com.reservationsys.repositories.UserRepository;
import com.reservationsys.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	UserRepository service;
	
	public List<User> findAll(){
		return service.findAll();
	}
	
	public User findById(String id) {
		Optional<User> user = service.findById(id);
		if (user.isEmpty()) {
			throw new ObjectNotFoundException("Objeto não encontrado!");
		}
		return user.get();
	}
	
}
