package com.kata.tennis;

public class Player {

    private String name;

    private int point = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPoint() {
        return point;
    }

    public String getScore() {
        return Score.getScore(point);
    }

    public void addPoint() {
        point++;
    }
}
