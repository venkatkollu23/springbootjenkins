package com.neo.workshop.conditionbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebServiceClientService {

    public WebServiceClientService(){
        System.out.println(" from WebServiceClientService constructor ");
    }

    @Autowired
    IntegrationWebService integrationWebService;

    public void callRemoteMethod(){
        integrationWebService.sendData();
    }
}
