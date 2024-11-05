package com.neo.workshop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountStaticTest {

    int i =10;

    static int j =20;

    public void show(){
        System.out.println(i);

        System.out.println(j);
    }


    public static void main(String[] args){
        AccountStaticTest test = new AccountStaticTest();
  System.out.println(test.i);

        System.out.println(j);
        AccountStaticVariables person1 = new AccountStaticVariables();
        person1.setSequenceInstant(person1.getSequenceInstant()+1);
        AccountStaticVariables.setSequenceStatic(AccountStaticVariables.getSequenceStatic()+1);

        AccountStaticVariables person2 = new AccountStaticVariables();
        person2.setSequenceInstant(person2.getSequenceInstant()+1);
        AccountStaticVariables.setSequenceStatic(AccountStaticVariables.getSequenceStatic()+1);

        AccountStaticVariables person3 = new AccountStaticVariables();
        person3.setSequenceInstant(person3.getSequenceInstant()+1);
        AccountStaticVariables.setSequenceStatic(AccountStaticVariables.getSequenceStatic()+1);

        System.out.println("  Instant Variable value  "+person2.getSequenceInstant());
        System.out.println("  Static  Variable value  "+AccountStaticVariables.getSequenceStatic());


    }
}
