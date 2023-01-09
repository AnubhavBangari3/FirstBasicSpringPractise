/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.hello;

import com.example.hello.*;

public class Person {
    String name;
    int age;
    //Calling class
    Address address;
    
    Person(String name,int age,Address address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
    
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
    void setAge(int age){
        this.age=age;
    }
    int getAge(){
        return this.age;
    }
    void setAddress(Address address){
        this.address=address;
    }
    Address getAddress(){
        return this.address;
    }
}
