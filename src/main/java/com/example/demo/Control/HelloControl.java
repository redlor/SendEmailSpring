package com.example.demo.Control;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloControl {


  /*   To pass a value feom application.properties
    @Value("${app.name}")
    private String appName;*/

    @RequestMapping("/hello")
    public String hello()  {
        return "Hello World";
    }


}
