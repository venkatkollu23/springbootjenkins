package com.neo.workshop.polymorphism.abstractdemo;

public class BirdServiceImpl implements TravelServoce {

    @Override
   public void fly(){


    }
    @Override
   public void move() {
        throw new RuntimeException();
    }

}
