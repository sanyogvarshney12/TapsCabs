package com.travel.tapscabs.controller;

import com.travel.tapscabs.model.UserRegistration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @implNote UserRegistration RestController interface
 * @author Sanyog Varshney
 * @version 1.0
 */
public interface IUserRegistrationController {

    @PostMapping("/user")
    ResponseEntity<UserRegistration> addUser(@RequestBody UserRegistration userRegistration);

    @GetMapping("/user")
    ResponseEntity<UserRegistration> fetchUser(@RequestHeader("emailId") String emailId);

    @PatchMapping("/user")
    ResponseEntity<UserRegistration> updateUser(@RequestHeader("emailId") String emailId, @RequestParam("name") String userName, @RequestParam("mobileNo") long mobileNo);

}
