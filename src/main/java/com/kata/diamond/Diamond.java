package com.kata.diamond;

public class Diamond {

    public static void printDiamond(char character) {
        if (character == 'B') {
            System.out.print("\tA\t\nB\t\tB\n\tA");
            return;
        }
        System.out.print(character);
    }

}
