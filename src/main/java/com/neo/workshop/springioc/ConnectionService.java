package com.neo.workshop.springioc;

public interface ConnectionService {

     NeoConnection getConnection(String url,String userName,String password);
}
