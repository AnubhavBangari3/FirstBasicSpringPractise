/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.hello;
import  com.example.game.MarioGame;
import com.example.game.GameRunner;
import com.example.game.SuperContraGame;
import com.example.game.PackmanGame;
import com.example.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author anubh
 */
public class AppGamingHello {
    public static void main(String[] args){
        try(AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(GamingConfig.class)){
            context.getBean(GamingConsole.class).up(); 
            context.getBean(GameRunner.class).run();
            
        }
        
        
       
    }
    
}
  