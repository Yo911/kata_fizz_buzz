package com.kata.tennis;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ScoreTest {
    @Test
    void should_return_zero_when_no_score() {
        String value = Score.getScore(0);

        Assertions.assertEquals("0", value);
    }
}
