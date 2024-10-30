package com.neo.workshop;


import java.util.Date;

public class AccountWithPrivateInstantVariables {

    private String accountNumber;
    private String accountHolderName;


    public void setAccountHolderName(String inputAccountHolderName){
        this.accountHolderName=inputAccountHolderName;
    }

    public String getAccountHolderName(){
        return  this.accountHolderName;
    }


    private String adhar;
    private String pan;
    private Date dob;

    private  boolean isKYCValidate;

    private int age;

    private boolean isInsuranceEnabled;

    private  double interestRate;





    // Default values for any class type is null

    // boolens for flase

    // int is 0

    //  double is 0.0

    Date d = new Date();

    private String nriProof;


    public AccountWithPrivateInstantVariables(){
    }

    public AccountWithPrivateInstantVariables(String accountHolderName,
                                              String  adhar, String pan, Date dob){
        this.accountHolderName=accountHolderName;
        this.adhar = adhar;
        this.pan = pan;
        this.dob = dob;
    }

    public AccountWithPrivateInstantVariables(String accountHolderName,
                                              String  adhar, String pan, Date dob, String nriProof){

        this(accountHolderName,adhar,pan,dob);
    this.nriProof=nriProof;


    }





}
