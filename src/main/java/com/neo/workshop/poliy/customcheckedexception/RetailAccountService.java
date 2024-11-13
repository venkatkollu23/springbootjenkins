package com.neo.workshop.poliy.customcheckedexception;

public interface RetailAccountService extends AccountService {

    Account createAccount(String adhar, String pan);

}
