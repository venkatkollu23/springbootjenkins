package com.neo.workshop;

import java.util.Date;

public class AccountTestWithPrivateVariables {


    public static void main(String[] args){


       // AccountWithPrivateInstantVariables accountNoArugumentConstructor = null;
       AccountWithPrivateInstantVariables accountNoArugumentConstructor = new AccountWithPrivateInstantVariables();

        accountNoArugumentConstructor.setAccountHolderName("Venkat");

        AccountWithPrivateInstantVariables accountWithParameterizedConstructor =
                new AccountWithPrivateInstantVariables("Sai",
                "22222","ABC111",new Date(),"USA");

        Account accountWithParameterizedConstructor2 = new Account("Sai",
                "22222","ABC111",new Date(),"USA");

        System.out.println(accountWithParameterizedConstructor.getAccountHolderName());
        System.out.println(accountNoArugumentConstructor.getAccountHolderName());

    }
}
