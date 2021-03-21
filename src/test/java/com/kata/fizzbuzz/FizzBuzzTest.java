package com.kata.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    void should_return_fizz_when_number_is_3() {
        int number = 3;

        String result = FizzBuzz.isFizzBuzzNumber(number);

        Assertions.assertEquals("Fizz", result);
    }

    @Test
    void should_return_buzz_when_number_is_5() {
        int number = 5;

        String result = FizzBuzz.isFizzBuzzNumber(number);

        Assertions.assertEquals("Buzz", result);
    }

    @Test
    void should_return_buzz_when_number_is_10() {
        int number = 10;

        String result = FizzBuzz.isFizzBuzzNumber(number);

        Assertions.assertEquals("Buzz", result);
    }

}