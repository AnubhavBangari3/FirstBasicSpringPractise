/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.game;

/**
 *
 * @author anubh
 */
public class SuperContraGame implements GamingConsole{
     public void up(){
        System.out.println("Super Jump");
    }
    public void down(){
        System.out.println("Down");
    }
    public void right(){
        System.out.println("Super Fast");
    }
    public void left(){
        System.out.println("Shoot");
    }
    
}
