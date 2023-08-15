package com.fabrice.javafirstcrud.controllers;

import com.fabrice.javafirstcrud.exceptions.UserNotFoundException;
import com.fabrice.javafirstcrud.models.User;
import com.fabrice.javafirstcrud.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController //anotation which adds rest api methods to this controller
public class UserController {
    //getting access to sql methods within this controller
    //we do that by connecting the user repository
    @Autowired
    private UserRepository userRepository;

    //API to create new user
    @PostMapping("/user")
    User saveNewUser(@RequestBody User newUser) { //return type is User obj for this method
        return userRepository.save(newUser);
    }

    //API to get all users
    @GetMapping("/users")
    List<User> getAllUsers() {
        return userRepository.findAll();
    }

    //Getting single user
    @GetMapping("/user/{id}")
    // @ResponseStatus(HttpStatus.CREATED) //in case you want to change the status code
    User getSingleUser(@PathVariable long id) { // Long is the datatype of the param (id)
        return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
    }

    //edit user
    @PutMapping("/user/{id}")
    User updateUser(@PathVariable long id, @RequestBody User updatedUser) {
        return userRepository.findById(id).map(user -> {
            user.setEmail(updatedUser.getEmail());
            user.setNames(updatedUser.getNames());
            user.setUsername(updatedUser.getUsername());
            return userRepository.save(user);
        }).orElseThrow(() -> new UserNotFoundException(id));
    }

    @DeleteMapping("user/{id}")
    Map<String, String> deleteUser(@PathVariable long id) {
        userRepository.deleteById(id);
        Map<String, String> response = new HashMap<>();
        response.put("message", "user " + id + " has been deleted successfully");
        return response;
    }

}
