package com.neo.workshop.springioc;

public class MysqlConnectionService implements ConnectionService{


    private TCPConnectionService tcpConnectionService ;
    public MysqlConnectionService(TCPConnectionService tcpConnectionService){

        System.out.println("  from mysql constructor ");

        this.tcpConnectionService = tcpConnectionService;
    }

    @Override
    public NeoConnection getConnection(String url, String userName, String password) {

        NeoConnection  conn= new NeoConnection("MysqlConnection");

      System.out.println(" getConnnection from mysql  ");
        tcpConnectionService.connect();
        return conn;
    }
}
