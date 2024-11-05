package com.neo.workshop;

import java.util.Date;

public class AccountTest {


    public static void main(String[] args){
        ProtectedConstructor protectedConstructor = new ProtectedConstructor();

        Account accountNoArugumentConstructor = new Account();

        accountNoArugumentConstructor.accountHolderName="Venkat";

        Account accountWithParameterizedConstructor = new Account("Sai",
                "22222","ABC111",new Date(),"USA");

        Account accountWithParameterizedConstructor2 = new Account("Sai",
                "22222","ABC111",new Date(),"USA");

        System.out.println(accountWithParameterizedConstructor.accountHolderName);

    }
}
