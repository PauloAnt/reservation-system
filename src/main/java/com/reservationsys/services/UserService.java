package com.reservationsys.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservationsys.dto.UserDTO;
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
	
	public User insert(User user) {
		return service.insert(user);
	}
	
	public void delete(String id) {
		findById(id);
		service.deleteById(id);
	}
	
	public User update(User user) {
		User obj = findById(user.getId());
		updateData(obj, user);
		return service.save(obj);
		
	}
	
	private void updateData(User new_user, User user) {
		new_user.setEmail(user.getEmail());
		new_user.setUsername(user.getUsername());
	}
	
	public User fromDTO(UserDTO userdto) {
		return new User(userdto.getId(), userdto.getUsername(), userdto.getEmail(), userdto.getPassword());
	}
	
}
