package com.neo.workshop.domaindatatypes;

public class Account {

    private String accountNumber;

    public Account(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
