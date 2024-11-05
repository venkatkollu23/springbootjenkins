package com.neo.workshop.polymorphism.factorydesign;

import com.neo.workshop.polymorphism.abstractdemo.RetailAccountService;
import com.neo.workshop.polymorphism.abstractdemo.RetailAccountServiceImpl;

public class RetailAccountServiceFactory implements AccountFactory{
    @Override
    public RetailAccountService createAccount() {
        return new RetailAccountServiceImpl();
    }
}
