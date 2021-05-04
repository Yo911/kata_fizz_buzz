package com.kata.tennis;

public class Player {

    private int point = 0;

    public String getScore() {
        if (point == 1) {
            return "Love";
        }
        return "0";
    }

    public void addPoint() {
        point++;
    }
}
