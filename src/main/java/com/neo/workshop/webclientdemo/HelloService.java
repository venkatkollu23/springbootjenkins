package com.neo.workshop.webclientdemo;

import org.springframework.stereotype.Service;
// Singleton class


@Service
public class HelloService {

    public HelloService(){
        System.out.println("  from HelloService  constructor ");
    }




    public String search(){
        String searchId ;
        searchId =  String.valueOf(Math.random());

        System.out.println("   seachId  "+searchId +"  "+Thread.currentThread().getName());

      /*  try {
            Thread.sleep(10000);

        }catch (Exception e){

        }*/
        return searchId;
    }


    public String hotelBook(String searchId){
        System.out.println("  sarchId  "+searchId);

        return "BOOKED";
    }

}
