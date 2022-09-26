package com.travel.tapscabs.controller;

import com.travel.tapscabs.model.UserDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @implNote UserRegistration RestController interface
 * @author Sanyog Varshney
 * @version 1.0
 */
public interface IUserRegistrationController {

    @PostMapping("/register")
    ResponseEntity<UserDetails> addUser(@RequestBody UserDetails userRegistration);

    @GetMapping("/register")
    ResponseEntity<UserDetails> fetchUser(@RequestHeader("emailId") String emailId);

    @PatchMapping("/register")
    ResponseEntity<UserDetails> updateUser(@RequestHeader("emailId") String emailId, @RequestParam("name") String userName, @RequestParam("mobileNo") long mobileNo);

}
