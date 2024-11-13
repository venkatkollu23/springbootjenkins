package com.neo.workshop.poliy.customcheckedexception;

public class BirdServiceImpl implements TravelServoce {

    @Override
   public void fly(){


    }
    @Override
   public void move() {
        throw new RuntimeException();
    }

}
