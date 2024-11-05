package com.neo.workshop.polymorphism.abstractdemo;

import com.neo.workshop.polymorphism.Payment;
import com.neo.workshop.polymorphism.PaymentStatusEnum;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

public abstract  class SbiTransferService implements RBIPayment{






   BiPredicate<String,Double> balanceCheck = (accountNumber, amt) -> {
       Account accountBalance = SBIAccountDBService.accountMap.get(accountNumber);
        if (accountBalance != null &&  accountBalance.getBalance() > amt){
            return  true;
        }else {
            return  false;
        }

    };

// Abstract class can have concrete methods and abstract method

    // if class has a abstract method class must be a abstract \

    // if class marked as a abstract there is no rule to have a abstract method

Function<Double,Payment> errorSupplier = (amount) -> {
    Payment p = new Payment();
    p.setStatus(PaymentStatusEnum.FAILED.getLabel());
    p.setTransactionId(UUID.randomUUID().toString());
    p.setUter(UUID.randomUUID().toString());
    p.setTransactionDate(new Date());
    p.setAmount(amount);
    return  p;
};
    protected abstract boolean transactionLimitCheck(Account account,Double amount);

    @Override
    public Payment transfer(String fromAccount, String toAccount, Double amount) {
        Payment p = new Payment();
    // balance check
        if (balanceCheck.test(fromAccount,amount)) {
          Account account =   SBIAccountDBService.accountMap.get(fromAccount);
            // transaction limit
            if(this.transactionLimitCheck(account,amount)){
                p.setStatus(PaymentStatusEnum.SUCCESS.getLabel());
                p.setTransactionId(UUID.randomUUID().toString());
                p.setUter(UUID.randomUUID().toString());
                p.setTransactionDate(new Date());
                p.setAmount(amount);
                return  p;
            }else {
                return  errorSupplier.apply(amount);
            }

        }else {
            return  errorSupplier.apply(amount);
        }

    }
}
