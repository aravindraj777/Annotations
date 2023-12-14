package com.springannotations.in.annotations.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary

public class NonVegPizzza implements  Pizza{

    @Override

    public String getPizza() {
        return "Non-Veg Pizza!";
    }
}
