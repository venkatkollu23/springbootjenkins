package com.neo.workshop.conditionbean;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;



public class SoapWebServiceImpl  implements  IntegrationWebService{

    public SoapWebServiceImpl(){
        System.out.println("SoapWebServiceImpl Constructor ...");
    }


    @Override
    public void sendData() {
        System.out.println("SoapWebService sending data...");
    }
}
