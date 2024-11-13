package com.neo.workshop.polymorphism.websitedemo;

public class PaymentPage extends AngualrWebsite{

    public int i =30;

    public  int j =40;

    public void subTestWithSuperRef(){

    }

    public PaymentPage(String pageUrl) {
        super(pageUrl);
    }

    @Override
    public String header() {
        return super.header()+" Payment page";
    }

    @Override
    public String footer() {
        return "  footer page for payment";
    }
    @Override
    public String body() {
        return " from payment body page";
    }
}
