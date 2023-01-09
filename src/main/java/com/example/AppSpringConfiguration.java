/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

 

@Configuration
public class AppSpringConfiguration {
    @Bean
    public String name(){
        return "Abhi";
    }
    @Bean
    public int age(){
        return 22;
    }
    @Bean
    public Person person (){
    return new Person("AB",22,new Address("INA","Delhi"));
    
    }
    //for changing the name
    @Bean(name="address2")
    public Address address(){
        return new Address("Somewhere","New Delhi");
    }
    
    //Calling by method
    @Bean
    public Person person2methodCall (){
    return new Person(name(),age(),address());
    
    }
    //Calling by attribute
    @Bean
    public Person person3callAttribute (String name,int age,Address address2){
    return new Person(name,age,address2);
    
    }
}
