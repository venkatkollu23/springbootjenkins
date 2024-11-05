package com.neo.workshop.polymorphism.abstractdemo;

public class NEFTSBITransferServiceImpl extends SbiTransferService{
    @Override
    protected boolean transactionLimitCheck(Account account, Double amount) {

        System.out.println("  Validating transactionLimitCheck for account in NEFTSBITransferServiceImpl"+account.getAccount());

        if (amount < 100000)
            return true;
        else {
            return  false;
        }
    }
}
