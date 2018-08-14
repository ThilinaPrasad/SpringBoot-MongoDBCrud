package com.spring.mongodb.springmongodb.repository;

import com.spring.mongodb.springmongodb.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<User,String> {
}
