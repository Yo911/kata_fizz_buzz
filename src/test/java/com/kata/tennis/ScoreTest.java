package com.kata.tennis;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ScoreTest {
    @Test
    void should_return_zero_when_no_score() {
        String value = Score.getScore(0);

        Assertions.assertEquals("0", value);
    }

    @Test
    void should_return_love_when_one_point_score() {
        String value = Score.getScore(1);

        Assertions.assertEquals("Love", value);
    }

    @Test
    void should_return_fifteen_when_two_point_score() {
        String value = Score.getScore(2);

        Assertions.assertEquals("Fifteen", value);
    }
}
