package com.example.Simple.Web.App.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//public class HomeController {
//
//    @RequestMapping("/")
//    @ResponseBody
//    public String greet()
//    {
//        return "Welcome to SAP home page";
//    }
//}



@RestController
public class HomeController {
    @RequestMapping("/")
    public String greet()
    {
        return "Welcome to SAP home page..";
    }

    @RequestMapping("/about")
    public String lai()
    {
        return "its about page of SAP Labs";
    }


}


