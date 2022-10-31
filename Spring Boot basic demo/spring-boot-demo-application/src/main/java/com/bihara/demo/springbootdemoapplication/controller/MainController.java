package com.bihara.demo.springbootdemoapplication.controller;

import com.bihara.demo.springbootdemoapplication.model.User;
import com.bihara.demo.springbootdemoapplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/hello")
    public String greeting() {
        return "Hello SpringBoot";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ResponseEntity<User> fetchUser(@RequestParam int id) {
        User user =userService.fetchUserById(id);

        if(user!=null){
            return ResponseEntity.ok().body(user);
        }else {
            return ResponseEntity.notFound().build();
        }
    }
}
