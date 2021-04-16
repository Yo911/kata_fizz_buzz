package com.kata.fractions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FractionTest {

    @Test
    void should_return_2_on_3_when_add_fractions_5_on_15_and_5_on_15()
    {
        // Given
        Fraction fraction = new Fraction(5, 15);
        Fraction fraction2 = new Fraction(5, 15);

        // When
        fraction.add(fraction2);

        // Then
        Assertions.assertEquals(2, fraction.getNumerator());
        Assertions.assertEquals(3, fraction.getDenominator());
    }

    @Test
    void should_return_1_on_1_when_add_fractions_5_on_15_and_10_on_15()
    {
        // Given
        Fraction fraction = new Fraction(5, 15);
        Fraction fraction2 = new Fraction(10, 15);

        // When
        fraction.add(fraction2);

        // Then
        Assertions.assertEquals(1, fraction.getNumerator());
        Assertions.assertEquals(1, fraction.getDenominator());
    }

    @Test
    void should_return_1_on_1_when_add_fractions_3_on_18_and_6_on_21()
    {
        // Given
        Fraction fraction = new Fraction(3, 18);
        Fraction fraction2 = new Fraction(6, 21);

        // When
        fraction.add(fraction2);

        // Then
        Assertions.assertEquals(3, fraction.getNumerator());
        Assertions.assertEquals(7, fraction.getDenominator());
    }
}