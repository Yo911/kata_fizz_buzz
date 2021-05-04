package com.kata.tennis;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlayerTest {
    private Player player;

    @BeforeEach
    void init() {
        player = new Player();
    }

    @Test
    void should_return_0_when_get_score() {
        String score = player.getScore();

        Assertions.assertEquals("0", score);
    }

    @Test
    void should_return_love_when_have_one_point() {
        player.addPoint();
        String score = player.getScore();

        Assertions.assertEquals("Love", score);
    }

    @Test
    void should_return_fifteen_when_have_two_points() {
        player.addPoint();
        player.addPoint();
        String score = player.getScore();

        Assertions.assertEquals("Fifteen", score);
    }
}