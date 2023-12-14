package com.springannotations.in.annotations.propertysource;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
//@PropertySource("classpath:mail.properties")

@PropertySources({
        @PropertySource("classpath:newmail.properties")
})
public class AppConfigue {

}
