package com.example.Simple.Web.App.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Data return hoga
public class LoginController {
    @RequestMapping("/login")
    public String login()
    {
        return "loginpage";
    }
}
