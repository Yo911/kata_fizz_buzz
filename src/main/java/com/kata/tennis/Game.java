package com.kata.tennis;

public class Game {
    private Player playerOne;

    private Player playerTwo;

    public Game(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public String showScore() {
        if (playerOne.getPoint() == 3 && playerTwo.getPoint() == 3) {
            return "Deuce";
        }
        return playerOne.getScore() + " : " + playerTwo.getScore();
    }
}
