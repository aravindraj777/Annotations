package com.springannotations.in.annotations.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    public String hello(){
        return "Hello Service";
    }


}
