package com.fyukio.workshopmongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fyukio.workshopmongo.domain.User;
import com.fyukio.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired 
	private UserRepository repo;
	public List<User> findAll() {
		return repo.findAll();
		
	}

}
