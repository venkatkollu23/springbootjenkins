package com.neo.workshop.polymorphism.abstractdemo;

public interface RefundTaxAccountService extends AccountService{

     Account createAccount(String itrtax, String pan);
}
