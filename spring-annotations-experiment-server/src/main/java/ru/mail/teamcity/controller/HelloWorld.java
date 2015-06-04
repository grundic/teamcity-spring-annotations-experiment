package ru.mail.teamcity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Author: g.chernyshev
 * Date: 04.06.15
 */
@Controller
public class HelloWorld {
    @RequestMapping(value = "/app/hello", method = RequestMethod.GET)
    public String hello(){
        return  "Hello World, Teamcity!";
    }
}
