package com.neo.workshop.conditionbean;


import org.springframework.stereotype.Service;


public class RestWebServiceImpl implements IntegrationWebService{


    public RestWebServiceImpl(){
        System.out.println("RestWebServiceImpl Constructor ...");
    }
    @Override
    public void sendData() {
        System.out.println("RestWebService sending data...");
    }

}
