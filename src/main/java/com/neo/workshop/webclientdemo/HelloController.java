package com.neo.workshop.webclientdemo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    HelloService helloService;

    public HelloController(HelloService helloService){
        this.helloService = helloService;
    }

    @GetMapping(value = "/hello")
    public String getName() {
        String searchId = helloService.search();

       return helloService.hotelBook(searchId);
    }

}
