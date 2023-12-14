package com.springannotations.in.annotations.controller;

import com.springannotations.in.annotations.beans.SimDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/simapi")
public class SimController {


    private List<SimDetails> sim ;

    @PostConstruct
    public void simList(){

        sim  = new ArrayList<>();
        sim.add(new SimDetails("Idea","micrro",1));
        sim.add(new SimDetails("vodafone","Normal",2));
        sim.add(new SimDetails("Airtel","mini",3));
    }

    @GetMapping("/simlist")
    public List<SimDetails> getSim(){
        return sim;
    }


    @GetMapping("/simlist/{id}")
    public SimDetails getSimId(@PathVariable int id){
        return sim.get(id);
    }


}
