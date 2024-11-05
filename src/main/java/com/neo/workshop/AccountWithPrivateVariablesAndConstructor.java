package com.neo.workshop;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class AccountWithPrivateVariablesAndConstructor {


    public static void main(String[] args){




       // AccountWithPrivateInstantVariables accountNoArugumentConstructor = null;
        AccountWithPrivateInstantVariablesConstructor accountNoArugumentConstructor =
                AccountWithPrivateInstantVariablesConstructor.getInstance();

        accountNoArugumentConstructor.setAccountHolderName("Venkat");
        accountNoArugumentConstructor.setAdhar("12345");
        accountNoArugumentConstructor.setPan("QQQQQQ123");

        System.out.println(accountNoArugumentConstructor.getAccountHolderName());
        System.out.println(accountNoArugumentConstructor.getPan());


           List list = new ArrayList<>();

        for (int i =0;i<1000000;i++){
            Account accountWithParameterizedConstructor2 = new Account("Sai",
                    "22222","ABC111",new Date(),"USA");
            Account accountWithParameterizedConstructor22 = new Account("Sai",
                    "22222","ABC111",new Date(),"USA");
            Account accountWithParameterizedConstructor23 = new Account("Sai",
                    "22222","ABC111",new Date(),"USA");
            Account accountWithParameterizedConstructor24 = new Account("Sai",
                    "22222","ABC111",new Date(),"USA");

            list.add(accountWithParameterizedConstructor2);

            list.add(accountWithParameterizedConstructor22);
            list.add(accountWithParameterizedConstructor23);
            list.add(accountWithParameterizedConstructor24);
            System.out.println(" accountWithParameterizedConstructor2 address"+accountWithParameterizedConstructor2.hashCode());
            System.out.println(" accountWithParameterizedConstructor22 address"+accountWithParameterizedConstructor22.hashCode());
            System.out.println(" accountWithParameterizedConstructor23 address"+accountWithParameterizedConstructor23.hashCode());
            System.out.println(" accountWithParameterizedConstructor24 address"+accountWithParameterizedConstructor24.hashCode());
                System.out.println(" Exit from for loop first");
        }
        for (int i =0;i<1000000000;i++){
            System.out.println(" Enter into  second for loop ");
            Account accountWithParameterizedConstructor2 = new Account("Sai",
                    "22222","ABC111",new Date(),"USA");
            Account accountWithParameterizedConstructor22 = new Account("Sai",
                    "22222","ABC111",new Date(),"USA");
            Account accountWithParameterizedConstructor23 = new Account("Sai",
                    "22222","ABC111",new Date(),"USA");
            Account accountWithParameterizedConstructor24 = new Account("Sai",
                    "22222","ABC111",new Date(),"USA");
            System.out.println(" Exit from second for loop ");
        }

    }
}
