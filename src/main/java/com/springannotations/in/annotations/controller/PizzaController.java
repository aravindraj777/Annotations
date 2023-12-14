package com.springannotations.in.annotations.controller;

import com.springannotations.in.annotations.service.Pizza;
import com.springannotations.in.annotations.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class PizzaController {


    private Pizza pizza;

//    @Autowired
    public PizzaController( Pizza pizza){
        this.pizza = pizza;
    }

//    @Autowired
//    public void setVegPizza(VegPizza vegPizza) {
//        this.vegPizza = vegPizza;
//    }

    public String getpizza(){
        return pizza.getPizza();
    }

    public void init(){
        System.out.println("Initialization logic");
    }
    public void destroy(){
        System.out.println("Destruction Logic");
    }

}
