package com.in28minutes.learningspringframework;

import com.in28minutes.learningspringframework.game.MarioGame;
import com.in28minutes.learningspringframework.game.SuperContraGame;
import com.in28minutes.learningspringframework.game.PacMan;
import com.in28minutes.learningspringframework.game.GameRunner;

public class App01GamingBasic {
    public static void main(String[] args) {
        
        var game = new MarioGame();
        var game2 = new SuperContraGame();
        var game3 = new PacMan();

        var gameRunner = new GameRunner(game3); // Object creation + wiring of dependencies, Game is a dependency of GameRunner
        gameRunner.run();
    }
}
