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
public class MarioGame implements GamingConsole {
    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("Down");
    }
    public void right(){
        System.out.println("Fast");
    }
    public void left(){
        System.out.println("Back");
    }
}
