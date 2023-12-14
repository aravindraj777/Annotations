package com.springannotations.in.annotations.beans;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class SimDetails {

    private String name;
    private String model;
    private int slot;
}
