package com.neo.workshop.cyclicdependency;

public class CyclicDependencyTest {

public static void main(String[] args){
    B b = new B();
    A a = new A();

    b.a = a;
    a.b = b;



}
}
