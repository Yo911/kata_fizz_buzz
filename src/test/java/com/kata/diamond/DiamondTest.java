package com.kata.diamond;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DiamondTest {

    @Test
    void should_print_diamond_with_A_letter() {
        String result = Diamond.buildDiamond('A');

        Assertions.assertEquals("A", result);
    }

    @Test
    void should_print_diamond_with_B_letter() {
        String result = Diamond.buildDiamond('B');

        Assertions.assertEquals("\t\tA\n\tB\t\tB\n\t\tA\n", result);
    }

    @Test
    void should_print_diamond_with_C_letter() {
        String result = Diamond.buildDiamond('C');

        Assertions.assertEquals("\t\t\tA\n\t\tB\t\tB\n\tC\t\t\t\tC\n\t\tB\t\tB\n\t\t\tA\n", result);
    }
}