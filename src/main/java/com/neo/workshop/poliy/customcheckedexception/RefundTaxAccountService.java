package com.neo.workshop.poliy.customcheckedexception;

public interface RefundTaxAccountService extends AccountService {

     Account createAccount(String itrtax, String pan);
}
