package com.neo.workshop.poliy.customcheckedexception;

import com.neo.workshop.poliy.customcheckedexception.exceptions.InsufficientBalanceException;
import com.neo.workshop.polymorphism.Payment;

public interface RBIPayment {

    Payment transfer(String fromAccount, String toAccount, Double amount) throws InsufficientBalanceException;
}
