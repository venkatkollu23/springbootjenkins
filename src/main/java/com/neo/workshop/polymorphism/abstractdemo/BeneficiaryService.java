package com.neo.workshop.polymorphism.abstractdemo;

import com.neo.workshop.polymorphism.Payment;

import java.util.ArrayList;

public class BeneficiaryService {

    Beneficiary addBeneficiary(Account account,Beneficiary beneficiary){

        ArrayList<Beneficiary> beneficiaryArrayList = SBIAccountDBService.accountBenneificaryMap.get(account.getAccount());

        if (beneficiaryArrayList != null) {
            beneficiaryArrayList.add(beneficiary);
        } else {
            beneficiaryArrayList = new ArrayList<Beneficiary>();
            beneficiaryArrayList.add(beneficiary);
            SBIAccountDBService.accountBenneificaryMap.put(account.getAccount(), beneficiaryArrayList);
        }


        return beneficiary;

    }
}
