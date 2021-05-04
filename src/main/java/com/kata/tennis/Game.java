package com.kata.tennis;

public class Game {
    private Player playerOne;

    private Player playerTwo;

    public Game(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public String showScore() {
        if (playerOne.getPoint() + playerTwo.getPoint() == 7) {
            return advantage();
        }
        if (isDeuceScore()) {
            return "Deuce";
        }
        return playerOne.getScore() + " : " + playerTwo.getScore();
    }

    private boolean isDeuceScore() {
        return playerOne.getPoint() == 3 && playerTwo.getPoint() == 3;
    }

    private String advantage() {
        String playerName = playerOne.getPoint() > playerTwo.getPoint() ? playerOne.getName() : playerTwo.getName();
        return playerName + ": Advantage";
    }
}
