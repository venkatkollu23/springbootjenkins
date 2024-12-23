package com.neo.workshop.springioc;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.neo.workshop.springioc")
@Configuration
public class SpringCoreConfiguration {


    @Bean(name = "externalJavaService")
    public ExternalJavaService externalJavaService(){
        ExternalJavaService externalJavaService = new ExternalJavaService();
        return externalJavaService ;
    }

    @Bean
    public TCPConnectionService tcpConnectionService(){
        return new TCPConnectionService();
    }

    @Bean
    public ConnectionService mysqlConnectionService(TCPConnectionService tCPConnectionService){

        return new MysqlConnectionService(tCPConnectionService );
    }

    @Bean
    public ConnectionService oracleConnectionService(TCPConnectionService tCPConnectionService){

        return new OracleConnectionService(tCPConnectionService );
    }

}
