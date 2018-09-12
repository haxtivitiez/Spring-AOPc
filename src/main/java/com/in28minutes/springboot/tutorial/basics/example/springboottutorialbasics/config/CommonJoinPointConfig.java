package com.in28minutes.springboot.tutorial.basics.example.springboottutorialbasics.config;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

    @Pointcut("execution(* com.in28minutes.springboot.tutorial.basics.example.springboottutorialbasics.dao.*.*(..))")
    public void dataLayerExecution() {}

    @Pointcut("execution(* com.in28minutes.springboot.tutorial.basics.example.springboottutorialbasics.business.*.*(..))")
    public void businessLayerExecution() {}

}