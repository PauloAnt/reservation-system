package com.reservationsys.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.reservationsys.entities.User;
import com.reservationsys.repositories.UserRepository;

@Configuration
public class TesteConfig implements CommandLineRunner{
	@Autowired
	UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maya", "maya@gmail.com", "maya123");
		User u2 = new User(null, "Hanna", "hanna@gmail.com", "hanna123");
		User u3 = new User(null, "Paulo", "paulo@gmail.com", "paulo123");
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3));
		
	}

}
