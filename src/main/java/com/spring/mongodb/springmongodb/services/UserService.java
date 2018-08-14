package com.spring.mongodb.springmongodb.services;

import com.spring.mongodb.springmongodb.models.User;
import com.spring.mongodb.springmongodb.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;


    public User createUser(User user){
        return userRepo.save(user);
    }

    public Optional<User> findById(String  id){
        return userRepo.findById(id);
    }

    public List<User> findAll(){
        return userRepo.findAll();
    }

    public User updateUser(User user){
        return userRepo.save(user);
    }

    public String deleteAll(){
        userRepo.deleteAll();
        return "deleted all records";
    }

    public String deleteById(String id){
        userRepo.deleteById(id);
        return "Record deleted";
    }

}
