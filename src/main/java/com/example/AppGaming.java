/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;
import  com.example.game.MarioGame;
import com.example.game.GameRunner;
import com.example.game.SuperContraGame;
import com.example.game.PackmanGame;

/**
 * 
 * @author anubh
 */
//23min
public class AppGaming {
    public static void main(String[] args){
        
        //SuperContraGame game=new SuperContraGame();
       PackmanGame game=new PackmanGame();
        
        //MarioGame game=new MarioGame();
        
        GameRunner gameRunner=new GameRunner(game);
        
        gameRunner.run();
    }
}
