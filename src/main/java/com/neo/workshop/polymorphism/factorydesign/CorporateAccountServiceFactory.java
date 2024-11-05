package com.neo.workshop.polymorphism.factorydesign;

import com.neo.workshop.polymorphism.abstractdemo.AccountService;
import com.neo.workshop.polymorphism.abstractdemo.CorporateAccountService;
import com.neo.workshop.polymorphism.abstractdemo.CorporateAccountServiceImpl;

public class CorporateAccountServiceFactory implements AccountFactory{
    @Override
    public CorporateAccountService createAccount() {
        return new CorporateAccountServiceImpl();
    }
}
