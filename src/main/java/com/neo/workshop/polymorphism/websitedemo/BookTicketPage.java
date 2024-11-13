package com.neo.workshop.polymorphism.websitedemo;

import ch.qos.logback.core.net.SyslogOutputStream;

public class BookTicketPage extends AngualrWebsite{


    public BookTicketPage(){

        this("bookTicketpage");
    }
    public BookTicketPage(String name){
        super(name);
    }
    @Override
    public String body(){
        return "BookTicketPage";
    }
}
