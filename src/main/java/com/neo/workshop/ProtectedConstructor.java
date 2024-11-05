package com.neo.workshop;

public class ProtectedConstructor {


    protected ProtectedConstructor(){

    }

    public static  ProtectedConstructor getInstance(){
        return  new ProtectedConstructor();
    }
}
