package com.neo.workshop;


import java.util.Date;

public class AccountStaticVariables {


    public int sequenceInstant;
    public static int sequenceStatic;

    public int getSequenceInstant() {
        return sequenceInstant;
    }

    public void setSequenceInstant(int sequenceInstant) {
        this.sequenceInstant = sequenceInstant;
    }

    public static int getSequenceStatic() {
        return sequenceStatic;
    }

    public static void setSequenceStatic(int sequenceStatic) {
        AccountStaticVariables.sequenceStatic = sequenceStatic;
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


    public AccountStaticVariables(){
    }

    public AccountStaticVariables(String accountHolderName,
                                  String  adhar, String pan, Date dob){
        this.accountHolderName=accountHolderName;
        this.adhar = adhar;
        this.pan = pan;
        this.dob = dob;
    }

    public AccountStaticVariables(String accountHolderName,
                                  String  adhar, String pan, Date dob, String nriProof){

        this(accountHolderName,adhar,pan,dob);
    this.nriProof=nriProof;


    }


}
