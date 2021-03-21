package com.kata.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class FizzBuzzTest {

    @Test
    void should_return_fizz_when_number_is_3() {
        int number = 3;

        String result = FizzBuzz.isFizzBuzzNumber(number);

        Assertions.assertEquals("Fizz", result);
    }

    @ParameterizedTest(name = "#{index} - should return buzz when number is {0}")
    @ValueSource(ints = {5, 10, 20, 25})
    void should_return_buzz_when_number_is_divisible_by_5(int number) {
        String result = FizzBuzz.isFizzBuzzNumber(number);

        Assertions.assertEquals("Buzz", result);
    }

    @Test
    void should_return_fizzbuzz_when_number_is_15() {
        int number = 15;

        String result = FizzBuzz.isFizzBuzzNumber(number);

        Assertions.assertEquals("FizzBuzz", result);
    }

}