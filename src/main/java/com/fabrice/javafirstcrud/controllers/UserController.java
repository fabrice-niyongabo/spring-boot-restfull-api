package com.fabrice.javafirstcrud.controllers;

import com.fabrice.javafirstcrud.models.User;
import com.fabrice.javafirstcrud.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //anotation which adds rest api methods to this controller
public class UserController {
    //getting access to sql methods within this controller
    //we do that by connecting the user repository
    @Autowired
    private UserRepository userRepository;

    //API to create new user
    @PostMapping("/user")
    User saveNewUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }
}
