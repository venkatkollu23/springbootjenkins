package com.neo.workshop.interfacesegrigation;

public interface NeoMap<K,V,R> {

    R put(K key, V value);
}
