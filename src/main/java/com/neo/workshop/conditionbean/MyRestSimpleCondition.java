package com.neo.workshop.conditionbean;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.lang.annotation.*;


public class MyRestSimpleCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        String type = System.getProperty("webservicetype");

        if (type.equals("rest")){
            return true;
        }
        return false;
    }
}
