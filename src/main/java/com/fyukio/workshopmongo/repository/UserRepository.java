package com.fyukio.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fyukio.workshopmongo.domain.User;

@Repository 
public interface UserRepository extends MongoRepository<User, String> {
	
	

}
