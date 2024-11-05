package com.neo.workshop;


import java.util.Date;

public class Account {


    {
        System.out.println(" from normal block ");
    }
    static  {
        System.out.println(" from static block ");
    }



    public String accountNumber;
    public String accountHolderName;
    public String adhar;
    public String pan;
    public Date dob;

    public  boolean isKYCValidate;

    public int age;

    public boolean isInsuranceEnabled;

    public  double interestRate;





    // Default values for any class type is null

    // boolens for flase

    // int is 0

    //  double is 0.0

    Date d = new Date();

    public String nriProof;


    public Account(){
        System.out.println(" from no argument constructor");
    }

    public Account( String accountHolderName,
                    String  adhar, String pan,  Date dob){
        this.accountHolderName=accountHolderName;
        this.adhar = adhar;
        this.pan = pan;
        this.dob = dob;
    }

    public Account( String accountHolderName,
                    String  adhar, String pan,  Date dob,String nriProof){

        this(accountHolderName,adhar,pan,dob);
    this.nriProof=nriProof;


    }


}
