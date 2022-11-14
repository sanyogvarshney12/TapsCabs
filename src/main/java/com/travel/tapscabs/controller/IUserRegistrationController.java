package com.travel.tapscabs.controller;

import com.travel.tapscabs.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @implNote UserRegistration RestController interface
 * @author Sanyog Varshney
 * @version 1.0
 */
public interface IUserRegistrationController {

    @PostMapping("/register")
    ResponseEntity<User> addUser(@RequestBody User userRegistration);

    @GetMapping("/register")
    ResponseEntity<User> fetchUser(@RequestHeader("emailId") String emailId);

    @PatchMapping("/register")
    ResponseEntity<User> updateUser(@RequestHeader("emailId") String emailId, @RequestParam("name") String userName, @RequestParam("mobileNo") long mobileNo);

}
