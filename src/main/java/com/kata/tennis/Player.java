package com.kata.tennis;

public class Player {

    private int point = 0;

    public String getScore() {
        return Score.getScore(point);
    }

    public void addPoint() {
        point++;
    }
}
