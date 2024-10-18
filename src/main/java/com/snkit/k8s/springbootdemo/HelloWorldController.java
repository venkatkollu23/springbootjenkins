package com.snkit.k8s.springbootdemo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(value = "/dockerDemo")
    public String helloWorld(){
        return " CI demo now to demo ci";
    }
}
