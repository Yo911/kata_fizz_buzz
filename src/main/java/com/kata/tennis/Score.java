package com.kata.tennis;

public class Score {
    public static String getScore(int point) {
        if (point == 2) {
            return "Fifteen";
        }
        if (point == 1) {
            return "Love";
        }
        return "0";
    }
}
