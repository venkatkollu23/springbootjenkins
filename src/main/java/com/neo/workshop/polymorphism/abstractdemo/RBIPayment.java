package com.neo.workshop.polymorphism.abstractdemo;

import com.neo.workshop.polymorphism.Payment;

public interface RBIPayment {

    Payment transfer(String fromAccount,String toAccount,Double amount);
}
