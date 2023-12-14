package com.springannotations.in.annotations.beans;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TicketDetails {

    private String name;
    private String destination;
    private int idno;


}
