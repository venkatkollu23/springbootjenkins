package com.neo.workshop.poliy.customcheckedexception;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SBIAccountDBService {
    public  static Map<String, Account> accountMap = new HashMap<>();

    public  static Map<String, ArrayList<Beneficiary>> accountBenneificaryMap = new HashMap<>();

    public  static Map<String, Transaction> accountTransactionMap = new HashMap<>();

}
