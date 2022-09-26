package com.travel.tapscabs.controller;

import org.springframework.web.bind.annotation.GetMapping;

public interface ILoginController {

    @GetMapping("login")
    public String login();
}
