package com.kata.diamond;

public class Diamond {

    public static final String TAB = "\t";

    public static final String LINE = "\n";

    public static final char FIRST_CHAR = 'A';

    public static void printDiamond(String characterToPrintOnDiamon) {
        char character = characterToPrintOnDiamon.charAt(0);
        System.out.print(buildDiamond(character));
    }

    public static String buildDiamond(char character) {
        int lengthDiamond = character - FIRST_CHAR + 1;
        if (lengthDiamond == 1) {
            return String.valueOf(character);
        }
        StringBuilder diamondBuilder = new StringBuilder();
        char currentChar = FIRST_CHAR;
        for (int i = 0; i < lengthDiamond; i++) {
            buildLineCurrentCharacter(lengthDiamond, diamondBuilder, currentChar, i);
            currentChar++;
        }
        currentChar = (char) (FIRST_CHAR + lengthDiamond - 2);
        for (int i = lengthDiamond - 2; i >= 0; i--) {
            buildLineCurrentCharacter(lengthDiamond, diamondBuilder, currentChar, i);
            currentChar--;
        }
        return diamondBuilder.toString();
    }

    private static void buildLineCurrentCharacter(int lengthDiamond, StringBuilder diamondBuilder, char currentChar, int i) {
        if (i == 0) {
            diamondBuilder.append(TAB.repeat(lengthDiamond)).append(currentChar).append(LINE);
            return;
        }
        diamondBuilder.append(TAB.repeat(lengthDiamond - i)).append(currentChar).append(TAB.repeat(i * 2)).append(currentChar).append(LINE);
    }

}
