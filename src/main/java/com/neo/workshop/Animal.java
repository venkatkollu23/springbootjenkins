package com.neo.workshop;

public class Animal {

    private final String name;
    protected final String nickName;

    public Animal(String name, String nickName) {
        this.name = name;
        this.nickName = nickName;
    }

    public static void main(String[] args) {
        Animal animal = new Animal("CAT", "Puppy");
        System.out.println(animal.name);
    }

}
