package com.neo.workshop.polymorphism.exception;

import com.neo.workshop.poliy.customcheckedexception.enumdemo.TransferEnum;
import com.neo.workshop.poliy.customcheckedexception.exceptions.InsufficientBalanceException;

public class PaymentService {

  static   int seats =10;


    public String payment(int numberOfTickets ) throws InsufficientBalanceException{
        try {

            if (numberOfTickets > 5) {
                throw new InsufficientBalanceException(TransferEnum.INSUFFICIENT_BALANCE.getCode(), TransferEnum.INSUFFICIENT_BALANCE.getLabel());
            }
        }catch (InsufficientBalanceException e){
            System.out.println(" Exception InsufficientBalanceException occurred "+e);
            throw  e;
        }catch (Exception e){
            System.out.println(" Exception occurred "+e);
            throw  e;
        }

        return  "SUCCESS";
    }
}
