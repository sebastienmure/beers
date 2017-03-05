package com.example.controller;

import com.example.model.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

/**
 * Created by sebas on 04/03/2017.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

//    @RequestMapping("/user")
//    public Principal user(Principal user) {
//        System.out.println(user.toString());
//        return user;
//    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable("id") Long id) {
        User user = userService.getUserById(id);
        System.out.println(user.getRoles());
        return user;
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST, produces = "application/json")
    public void createUser(@RequestBody User user) {
        userService.createUser(user);
    }
}
