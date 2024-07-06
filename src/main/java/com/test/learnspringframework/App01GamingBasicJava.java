package com.test.learnspringframework;

import game.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App01GamingBasicJava {

	public static void main(String[] args) {
		SpringApplication.run(App01GamingBasicJava.class, args);

	//	var marioGame = new MarioGame();
	//	var superContra = new SuperContra();
	//	var game = new MarioGame();
		var game = new PacmanGame();
		var gameRunner = new GameRunner(game);
	//	var gameRunner1 = new GameRunner1(superContra);
		gameRunner.run();
	//	gameRunner1.run();


	}

}
