package com.kata.tennis;

public class Game {
    private Player playerOne;

    private Player playerTwo;

    public Game(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public String showScore() {
        return playerOne.getScore() + " : " + playerTwo.getScore();
    }
}
