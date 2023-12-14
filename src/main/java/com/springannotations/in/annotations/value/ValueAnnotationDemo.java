package com.springannotations.in.annotations.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotationDemo {

    @Value("Default Name")
    private String defaultName;

    @Value("${mail.host}")
    private String host;

    @Value("${mail.email}")
    private String email;

    @Value("${mail.password}")
    private String password;

    @Value("10")
    private int defaultvalue;

    @Value("${java.home}")
    private String java;
//    @Value("${home}")
//    private String homeDir;

    public String getJava() {
        return java;
    }

//    public String getHomeDir() {
//        return homeDir;
//    }

    public String getHost() {
        return host;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getDefaultName() {
        return defaultName;
    }

    public int getDefaultvalue() {
        return defaultvalue;
    }




}
