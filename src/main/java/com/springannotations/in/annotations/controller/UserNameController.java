package com.springannotations.in.annotations.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserNameController {


    @GetMapping("/username/{str}")
    public String userName(@PathVariable String str){
        return str;
    }

}
