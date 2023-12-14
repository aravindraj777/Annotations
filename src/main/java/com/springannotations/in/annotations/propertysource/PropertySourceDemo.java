package com.springannotations.in.annotations.propertysource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PropertySourceDemo {



    @Autowired
    private Environment environment;

    @Autowired
    private Environment demo;

    private String adduser;
    public String getAdduser(){
        return demo.getProperty("gmail.user");
    }


//    @Value("${gmail.host}")
    private String host;

//    @Value("${gmail.email}")
    private String email;

//    @Value("${gmail.password}")
    private String password;

    public String getUsername() {
        return environment.getProperty("newmail.username");
    }

    private String username;

    public String getHost() {
        return environment.getProperty("gmail.host");
    }

    public String getEmail() {
        return environment.getProperty("newmail.email");
    }

    public String getPassword() {
        return environment.getProperty("newmail.password");
    }

}
