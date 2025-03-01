package com.in28minutes.learningspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App02HelloWorldSpring {
    public static void main(String[] args) {
        
        // 1: Launch a Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // 2: Configure the thigs that we want Spring to manage - @Configuration, @Bean
        System.out.println(context.getBean("name"));

        System.out.println(context.getBean("age"));

        System.out.println(context.getBean("person"));

        System.out.println(context.getBean("person2MethodCall"));

        System.out.println(context.getBean("person3Parameters"));

        System.out.println(context.getBean("address2")); // can get the bean by name

        // System.out.println(context.getBean(Address.class)); // can get the bean by class
    }
}
