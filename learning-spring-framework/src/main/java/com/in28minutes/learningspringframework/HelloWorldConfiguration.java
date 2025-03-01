package com.in28minutes.learningspringframework;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

record Person(String name, int age, Address address) {}; // record is a special class that is used to store data
record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
    
    @Bean
    public String name() {
        return "Chengyit";
    }
 
    @Bean
    public int age() {
        return 24;
    }
    
    // 3 different ways to create a bean
    @Bean
    public Person person() {
        return new Person("Chengyit", 24, new Address("Baker Street", "London"));
    }

    @Bean
    public Person person2MethodCall() { // name, age
        return new Person(name(), age(), address()); 
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3) { // name, age, address2
        return new Person(name, age, address3); 
    }

    // can customize the name of the bean
    @Bean(name = "address2") 
    public Address address() {
        return new Address("28 Greco Aisle", "Irvine");
    }


    @Bean(name = "address3") 
    public Address address3() {
        return new Address("Motinagar", "Hyderabad");
    }
}
