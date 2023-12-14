package com.springannotations.in.annotations.service;

import org.springframework.context.annotation.Primary;



//@Primary
public class VegPizza implements  Pizza{

    @Override
    public String getPizza(){
        return "vEGETABLE Pizza!";
    }
}
