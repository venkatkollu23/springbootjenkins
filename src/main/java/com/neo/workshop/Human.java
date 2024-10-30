package com.neo.workshop;

public class Human {

    public Hand hand;   // has a relationship

    public  String name;


    public Human(){   // No argument constructor
        hand = new Hand();
    }
    public Human(String name){   // parameterized  constructor
        this.name= name;
        hand = new Hand();
    }

}
