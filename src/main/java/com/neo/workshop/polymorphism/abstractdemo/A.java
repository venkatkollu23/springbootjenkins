package com.neo.workshop.polymorphism.abstractdemo;

public class A {

    private String name;

    private String adhar;

    public String getName() {
        return name;
    }

    public A  setName(String name) {
        this.name = name;
        return this;
    }

    public String getAdhar() {
        return adhar;
    }

    public A setAdhar(String adhar) {
        this.adhar = adhar;
        return this;
    }
}
