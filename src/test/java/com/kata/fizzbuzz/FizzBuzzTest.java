package com.kata.fizzbuzz;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    void should_return_number_when_number_is_dvible_by_3_or_5_or_7() {
        String result = FizzBuzz.isFizzBuzzNumber(4);

        Assertions.assertEquals("4", result);
    }

}