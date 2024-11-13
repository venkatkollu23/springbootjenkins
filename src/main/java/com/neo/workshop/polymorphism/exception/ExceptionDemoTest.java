package com.neo.workshop.polymorphism.exception;

import com.neo.workshop.poliy.customcheckedexception.exceptions.InsufficientBalanceException;

public class ExceptionDemoTest {

    public static void main(String[] args)  {


        System.out.println("Hello World");
        try {
            ExceptionTest test = new ExceptionTest();
            test.calcualteWithfinally(6);

            System.out.println(" Ticket booking is done");
        }catch (Exception e){
            System.out.println(((InsufficientBalanceException)e).getCode()+"  "+e.getMessage());
        }

        System.out.println(" I am done calculation");


    }
}
