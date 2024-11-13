package com.neo.workshop.polymorphism.websitedemo;

public class WebSiteTest {

    public static void main(String[] args){
        AngualrWebsite angualrWebsitePaymentPage= new PaymentPage(" payment page");

        System.out.println(angualrWebsitePaymentPage.page());
        System.out.println(angualrWebsitePaymentPage.i);

        PaymentPage paymentPage= new PaymentPage(" payment page");

        System.out.println(paymentPage.page());
        System.out.println(paymentPage.i);
        System.out.println(paymentPage.j);

        AngualrWebsite angualrWebsite= new AngualrWebsite(" payment page");

        System.out.println(angualrWebsite.page());
        System.out.println(angualrWebsite.i);



    }
}
