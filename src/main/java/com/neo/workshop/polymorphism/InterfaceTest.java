package com.neo.workshop.polymorphism;

public class InterfaceTest {

    public static void main(String[] args){
        UPIPayments payments = new PhonePay();

        Payment pay = payments.transfer("9573974624","6281825284",5000.0);

        System.out.println(pay.getTransactionId()+" status "+pay.getStatus());


        Payment pay2 = payments.transfer("9573974624","6281825284",5000.0);

        System.out.println(pay2.getTransactionId()+" status "+pay2.getStatus());


        Payment pay3= payments.transfer("9573974624","6281825284",3000.0);

        System.out.println(pay3.getTransactionId()+" status "+pay3.getStatus());

        System.out.println(" Balance of from account "+PhonePay.accountBalanceMap.get("9573974624"));
        System.out.println(" To account Balance "+PhonePay.accountBalanceMap.get("6281825284"));
    }
}
