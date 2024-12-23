package com.neo.workshop.springioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ExternalJavaService {

    @Qualifier("oracleConnectionService")
    @Autowired
    ConnectionService connectionService;

    public void external(){
        System.out.println(" external ");
        connectionService.getConnection("abc","abc","abc");
    }
}
