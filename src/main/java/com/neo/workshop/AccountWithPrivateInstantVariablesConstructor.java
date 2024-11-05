package com.neo.workshop;


import java.util.Date;

public class AccountWithPrivateInstantVariablesConstructor {

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

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAdhar() {
        return adhar;
    }

    public void setAdhar(String adhar) {
        this.adhar = adhar;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public boolean isKYCValidate() {
        return isKYCValidate;
    }

    public void setKYCValidate(boolean KYCValidate) {
        isKYCValidate = KYCValidate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isInsuranceEnabled() {
        return isInsuranceEnabled;
    }

    public void setInsuranceEnabled(boolean insuranceEnabled) {
        isInsuranceEnabled = insuranceEnabled;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public Date getD() {
        return d;
    }

    public void setD(Date d) {
        this.d = d;
    }

    public String getNriProof() {
        return nriProof;
    }

    public void setNriProof(String nriProof) {
        this.nriProof = nriProof;
    }

    private AccountWithPrivateInstantVariablesConstructor(){
    }



    public static AccountWithPrivateInstantVariablesConstructor getInstance(){

        AccountWithPrivateInstantVariablesConstructor privateConstuctor = new AccountWithPrivateInstantVariablesConstructor();

        return privateConstuctor;
    }







}
