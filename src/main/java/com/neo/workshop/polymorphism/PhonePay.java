package com.neo.workshop.polymorphism;

import java.util.*;
import java.util.function.BiPredicate;

public class PhonePay implements  UPIPayments{

   public  static Map<String,Double> accountBalanceMap = new HashMap<>();

    public  static Map<String, ArrayList<Payment>> accountHistoryMap = new HashMap<>();

    static {
        accountBalanceMap.put("9573974624",15000.0);
        accountBalanceMap.put("6281825284",5000.0);
    }


    BiPredicate<String,Double> balanceCheck = (accountNumber,amt) -> {
        Double accountBalance = accountBalanceMap.get(accountNumber);
        if (accountBalance > amt){
            return  true;
        }else {
            return  false;
        }
    };

    BiPredicate<String,Double> dailyLimitCheck = (accountNumber,amt) -> {
        Double dailyLimit =10000.0;
        ArrayList<Payment> paymentHistoryList = accountHistoryMap.get(accountNumber);
        if (paymentHistoryList != null){
            Double totalTranactionAmount  = 0.0;

            for (int i=0;i<paymentHistoryList.size();i++){
                Payment pay =      paymentHistoryList.get(i);
                totalTranactionAmount = totalTranactionAmount+pay.getAmount();
            }
            if (totalTranactionAmount < dailyLimit){
                return true;
            }else {
                return  false;
            }
        }else {
            return true;
        }

    };

    @Override
    public Payment transfer(String fromMobileNumber, String toNumber, Double amount) {
        int j=20;
        j = j+20;
        Payment p = new Payment();
        if (balanceCheck.test(fromMobileNumber,amount)) {
            if (dailyLimitCheck.test(fromMobileNumber,amount)) {
                Double fromAccountBalance = accountBalanceMap.get(fromMobileNumber);
                Double toAccountBalance = accountBalanceMap.get(toNumber);
                Double fromTotalBalance = fromAccountBalance - amount;
                Double toTotalBalance = toAccountBalance + amount;
                accountBalanceMap.put(fromMobileNumber, fromTotalBalance);
                accountBalanceMap.put(toNumber, toTotalBalance);
                p.setStatus(PaymentStatusEnum.SUCCESS.getLabel());
                p.setTransactionId(UUID.randomUUID().toString());
                p.setUter(UUID.randomUUID().toString());
                p.setTransactionDate(new Date());
                p.setAmount(amount);

                ArrayList<Payment> paymentArrayList = accountHistoryMap.get(fromMobileNumber);

                if (paymentArrayList != null) {
                    paymentArrayList.add(p);
                } else {
                    paymentArrayList = new ArrayList<Payment>();
                    paymentArrayList.add(p);
                    accountHistoryMap.put(fromMobileNumber, paymentArrayList);
                }
            }else {
                p.setStatus(PaymentStatusEnum.FAILED_DAILY_LIMIT.getLabel());
                p.setTransactionId(UUID.randomUUID().toString());
                p.setUter(UUID.randomUUID().toString());
                p.setTransactionDate(new Date());
            }

        }else {
            p.setStatus(PaymentStatusEnum.FAILED.getLabel());
            p.setTransactionId(UUID.randomUUID().toString());
            p.setUter(UUID.randomUUID().toString());
            p.setTransactionDate(new Date());


        }

        return  p;

    }
}
