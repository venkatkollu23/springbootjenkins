package com.neo.workshop.polymorphism.factorydesign;

import com.neo.workshop.polymorphism.abstractdemo.AccountService;

public interface AccountFactory {

     AccountService createAccount();

}
