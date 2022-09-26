package com.travel.tapscabs.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginControllerImpl implements ILoginController {

    public String login() {
        return "account/login";
    }
}
