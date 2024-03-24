package com.reservationsys.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.reservationsys.entities.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
}
