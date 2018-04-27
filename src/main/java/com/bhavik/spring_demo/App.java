package com.bhavik.spring_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	/*
    	 * Loading Beans with xml file and setter injection. 
    	 * */
        System.out.println( "Welcome to Java Spring Example !!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("resources/beans.xml");//Loading configuration file 
        context.getBean("emp");//Passing id of bean
        
    }
}
