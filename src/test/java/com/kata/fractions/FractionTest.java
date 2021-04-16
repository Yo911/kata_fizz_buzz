package com.kata.fractions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FractionTest {

    @Test
    void should_return_10_on_15_when_add_fractions_5_on_15_and_5_on_15()
    {
        // Given
        Fraction fraction = new Fraction(5, 15);
        Fraction fraction2 = new Fraction(5, 15);
        // fraction + fraction2 = 10/15
        Fraction resultExpected = new Fraction(2, 3);

        // When
        fraction.add(fraction2);

        // Then
        Assertions.assertEquals(10, fraction.getNumerator());
        Assertions.assertEquals(15, fraction.getDenominator());
    }

    @Test
    void should_return_15_on_15_when_add_fractions_5_on_15_and_10_on_15()
    {
        // Given
        Fraction fraction = new Fraction(5, 15);
        Fraction fraction2 = new Fraction(10, 15);
        // fraction + fraction2 = 1

        // When
        fraction.add(fraction2);

        // Then
        Assertions.assertEquals(15, fraction.getNumerator());
        Assertions.assertEquals(15, fraction.getDenominator());
    }

}