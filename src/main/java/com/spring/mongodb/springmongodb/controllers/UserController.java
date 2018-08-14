package com.spring.mongodb.springmongodb.controllers;

import com.spring.mongodb.springmongodb.models.User;
import com.spring.mongodb.springmongodb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("create")
    public String createUser(@RequestParam String firstname,@RequestParam String lastname, @RequestParam int age){
        return userService.createUser(new User(firstname,lastname,age)).toString();
    }

    @GetMapping("view/{id}")
    public String findUser(@PathVariable String id){
        return userService.findById(id).toString();
    }

    @GetMapping("view")
    public List<User> findAll(){
        return userService.findAll();
    }

    @PutMapping("update")
    public User update(@RequestBody User user){
        return userService.updateUser(user);
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable String id){
        return userService.deleteById(id);
    }

    @GetMapping("delete")
    public String deleteAll(){
        return userService.deleteAll();
    }

}
