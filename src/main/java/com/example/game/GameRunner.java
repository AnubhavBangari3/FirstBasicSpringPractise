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
public class GameRunner {
    private GamingConsole game;
    public GameRunner(GamingConsole game){
        this.game=game;
    }

    public void run() {
        //To change body of generated methods, choose Tools | Templates.
        System.out.println("Running Game" + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
    
}
