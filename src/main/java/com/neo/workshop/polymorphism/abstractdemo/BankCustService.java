package com.neo.workshop.polymorphism.abstractdemo;

import com.neo.workshop.polymorphism.Payment;
import com.neo.workshop.polymorphism.factorydesign.AccountFactory;
import com.neo.workshop.polymorphism.factorydesign.RetailAccountServiceFactory;

public class BankCustService {

    public static void main(String[] args){


        RetailAccountServiceImpl retailAccountService = new RetailAccountServiceImpl();

       Account a =  retailAccountService.createAccount("1234","22222");

       System.out.println("  without abstract factory "+a.getAccount());

        AccountFactory factory = new RetailAccountServiceFactory();
        RetailAccountService custService =  (RetailAccountService)factory.createAccount();
       Account account =  custService.createAccount("1234","22222");

        System.out.println("  with abstract factory "+account.getAccount());

        SbiTransferService neftsbiTransferService  = new NEFTSBITransferServiceImpl();

        Payment payment =  neftsbiTransferService.transfer(account.getAccount(),"HDFC123",15000.0);

System.out.println(" NEFT Payment status "+payment.getStatus());

       SbiTransferService rtgssbiTransferService  = new RTGSSBITransferServiceImpl();
        Payment rtgspayment =  rtgssbiTransferService.transfer(account.getAccount(),"HDFC123",9000.0);

        System.out.println(" RTGS Payment status "+rtgspayment.getStatus());

    }
}
