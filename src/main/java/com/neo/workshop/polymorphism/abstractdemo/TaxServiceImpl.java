package com.neo.workshop.polymorphism.abstractdemo;

import java.util.HashMap;
import java.util.Map;

public class TaxServiceImpl {

    public  static Map<String,Tax> taxMap = new HashMap<>();





    public static void addAccountToTax(Account account){

        Tax t  = new Tax();
        t.setPan("22222");
        t.setAmount(200000.0);
        t.setAccountNumber(account.getAccount());

        taxMap.put(account.getAccount(),t);
    }
}
