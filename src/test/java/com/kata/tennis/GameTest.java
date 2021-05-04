package com.kata.tennis;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {

    private Game game;

    private Player playerOne;
    private Player playerTwo;

    @BeforeEach
    void init() {
        playerOne = new Player();
        playerTwo = new Player();
        game = new Game(playerOne, playerTwo);
    }

    @Test
    void should_return_0_to_0_when_game_start() {
        String score = game.showScore();

        Assertions.assertEquals("0 : 0", score);
    }

    @Test
    void should_return_love_to_0_when_player_have_one_point() {
        playerOne.addPoint();
        String score = game.showScore();

        Assertions.assertEquals("Love : 0", score);
    }

    @Test
    void should_return_deuce_when_each_player_have_three_points() {
        playerOne.addPoint();
        playerOne.addPoint();
        playerOne.addPoint();

        playerTwo.addPoint();
        playerTwo.addPoint();
        playerTwo.addPoint();
        String score = game.showScore();

        Assertions.assertEquals("Deuce", score);
    }
}