package com.springannotations.in.annotations.controller;

import org.springframework.stereotype.Controller;

@Controller("Hai")
public class MyController {

    public String hello(){
        return "Hello Controller";
    }
}
