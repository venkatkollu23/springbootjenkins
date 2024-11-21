package com.neo.workshop.interfacesegrigation;

import com.neo.workshop.streamsdemo.Employee;

public class NeoMapImpl<K,V,R> implements NeoMap<K,V,R> {
    @Override
    public R put(K key, V value) {
        System.out.println(" key "+key+" value "+value);
        return (R)key  ;
    }

    public void putTest(String abc,String a){
        System.out.println(" key "+abc+" value "+a);
    }
}
