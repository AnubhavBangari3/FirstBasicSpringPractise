/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.hello;

import com.example.hello.*;

public class Address {
    String firstLine;
    String city;
    
    Address(String firstLine,String city){
        this.firstLine=firstLine;
        this.city=city;
    }
    void setFirst(String firstLine){
        this.firstLine=firstLine;
    }
    String getFirst(){
        return this.firstLine;
    }
    void setCity(String city){
        this.city=city;
    }
    String getCity(){
        return this.city;
    }
}
