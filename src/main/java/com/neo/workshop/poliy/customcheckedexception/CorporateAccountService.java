package com.neo.workshop.poliy.customcheckedexception;

public interface CorporateAccountService extends AccountService {

    Account createAccount(String gst, String pan);

}
