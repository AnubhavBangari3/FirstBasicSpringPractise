
package com.example.hello;
import  com.example.game.MarioGame;
import com.example.game.GameRunner;
import com.example.game.SuperContraGame;
import com.example.game.PackmanGame;
import com.example.game.GamingConsole;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfig {
    @Bean
    public GamingConsole game(){
        PackmanGame game=new PackmanGame();
        return game;
    }
    @Bean
    public GameRunner gameRunner(){
        GameRunner gameRunner=new GameRunner(game());
        return gameRunner;
    }
     //SuperContraGame game=new SuperContraGame();
       //PackmanGame game=new PackmanGame();
        
        //MarioGame game=new MarioGame();
        
       // GameRunner gameRunner=new GameRunner(game);
        
        //gameRunner.run();
    
}
