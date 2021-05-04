package com.kata.diamond;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class DiamondTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    private final PrintStream originalOut = System.out;

    @BeforeEach
    void init() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void end() {
        originalOut.print(outContent.toString());
        System.setOut(originalOut);
    }

    @Test
    void should_print_diamond_with_A_letter() {
        Diamond.printDiamond("A");

        Assertions.assertEquals("A", outContent.toString());
    }

    @Test
    void should_print_diamond_with_B_letter() {
        Diamond.printDiamond("B");

        Assertions.assertEquals("\t\tA\n\tB\t\tB\n\t\tA\n", outContent.toString());
    }

    @Test
    void should_print_diamond_with_C_letter() {
        Diamond.printDiamond("C");

        Assertions.assertEquals("\t\t\tA\n\t\tB\t\tB\n\tC\t\t\t\tC\n\t\tB\t\tB\n\t\t\tA\n", outContent.toString());
    }
}