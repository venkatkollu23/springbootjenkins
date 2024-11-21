package com.neo.workshop.interfacesegrigation;

public class GenericTest {

    public static void main(String[] args){
        Object map = new NeoMapImpl();

        Object result =     ((NeoMapImpl)map).put("stringtest","stringtest");

        Object intResult =  ((NeoMapImpl)map).put(1,2);

        System.out.println(result);

        System.out.println(intResult);


    }
}
