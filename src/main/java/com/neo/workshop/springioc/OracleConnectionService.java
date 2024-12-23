package com.neo.workshop.springioc;

public class OracleConnectionService implements ConnectionService{

    private TCPConnectionService tcpConnectionService ;
    public OracleConnectionService(TCPConnectionService tcpConnectionService){

        System.out.println("  from oracle constructor ");

        this.tcpConnectionService = tcpConnectionService;
    }

    @Override
    public NeoConnection getConnection(String url, String userName, String password) {
        NeoConnection  conn= new NeoConnection("MysqlConnection");

        System.out.println(" getConnnection from oracle  ");
        tcpConnectionService.connect();
        return conn;
    }
}
