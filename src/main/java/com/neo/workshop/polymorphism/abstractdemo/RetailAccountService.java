package com.neo.workshop.polymorphism.abstractdemo;

public interface RetailAccountService extends AccountService{

    Account createAccount(String adhar,String pan);

}
