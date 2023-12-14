package com.springannotations.in.annotations.config;


import com.springannotations.in.annotations.controller.PizzaController;
import com.springannotations.in.annotations.service.NonVegPizzza;
import com.springannotations.in.annotations.service.Pizza;
import com.springannotations.in.annotations.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Configuration
public class AppConfig {

    @Bean
    public Pizza vegPizza(){
        return  new VegPizza();
    }

    @Bean
    public Pizza nonVegPizza(){
        return new NonVegPizzza();
    }

    @Bean(initMethod = "init",destroyMethod = "destroy")

    public PizzaController pizzaController(){
        return new PizzaController(nonVegPizza());
    }




}
