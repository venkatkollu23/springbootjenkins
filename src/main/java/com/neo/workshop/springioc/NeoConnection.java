package com.neo.workshop.springioc;

public class NeoConnection {

    private String dataBase;

    public NeoConnection(String dbName){
        this.dataBase = dbName;
    }
}
