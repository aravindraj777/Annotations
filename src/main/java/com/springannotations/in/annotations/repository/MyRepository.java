package com.springannotations.in.annotations.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {

    public String hello(){
        return "Hello Repository";
    }
}
