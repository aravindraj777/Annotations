package com.springannotations.in.annotations.controller;


import com.springannotations.in.annotations.beans.StudentDetails;
import com.springannotations.in.annotations.beans.TicketDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/travelapi")
public class TicketController {

    private List<TicketDetails> ticketlist;

    @PostConstruct
    public void addTraveller(){
        ticketlist = new ArrayList<>();
        ticketlist.add(new TicketDetails("Aravind","Thrissur",5));
        ticketlist.add(new TicketDetails("Sreekanth","Kollam",8));
        ticketlist.add(new TicketDetails("Shyam","Poovar",10));
        ticketlist.add(new TicketDetails("Soossan","Parassala",6));
    }

    @GetMapping("/listtraveller")
    public List<TicketDetails> getStudentList(){

        return ticketlist;
    }

    @GetMapping("/listtraveller/{idd}")
    public TicketDetails getid(@PathVariable int idd){
        return ticketlist.get(idd);
    }

    @GetMapping("/name/{str}")
    public String printUser(@PathVariable String str){
        return str;
    }

}
