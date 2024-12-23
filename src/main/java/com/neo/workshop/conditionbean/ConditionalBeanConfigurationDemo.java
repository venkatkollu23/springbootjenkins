package com.neo.workshop.conditionbean;


import org.springframework.context.annotation.*;



@ComponentScan(basePackages = {"com.neo.workshop.conditionbean"})
@Configuration
public class ConditionalBeanConfigurationDemo {


    @Conditional({MyRestSimpleCondition.class})
    @Bean
    public IntegrationWebService integrationWebService(){
        return  new RestWebServiceImpl();
    }
    @Conditional({MySoapSimpleCondition.class})
    @Bean
    public IntegrationWebService soapIntegrationWebService(){
        return  new SoapWebServiceImpl();
    }


}
