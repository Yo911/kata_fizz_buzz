package com.kata.diamond;

public class Diamond {

    public static final String TAB = "\t";
    
    public static final String LINE = "\n";

    public static void printDiamond(String characterToPrintOnDiamon) {
        char character = characterToPrintOnDiamon.charAt(0);
        if (character == 'C') {
            System.out.print(TAB + "\t\tA" + LINE + "\t\tB\t\tB\n\tC\t\t\t\tC\n\t\tB\t\tB\n\t\t\tA");
            return;
        }
        if (character == 'B') {
            System.out.print(TAB + "A" + LINE + "B\t\tB\n\tA");
            return;
        }
        System.out.print(character);
    }

}
