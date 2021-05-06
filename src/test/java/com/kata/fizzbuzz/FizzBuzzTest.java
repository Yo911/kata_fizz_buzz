package com.kata.fizzbuzz;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class FizzBuzzTest {

    @ParameterizedTest(name = "#{index} - should return fizz when number is {0}")
    @ValueSource(ints = {2, 4, 8, 1})
    void should_return_number_when_number_is_dvible_by_3_or_5_or_7(int number) {
        String result = FizzBuzz.isFizzBuzzNumber(number);

        Assertions.assertEquals(String.valueOf(number), result);
    }

    @ParameterizedTest(name = "#{index} - should return fizz when number is {0}")
    @ValueSource(ints = {3, 6, 9, 12})
    void should_return_fizz_when_number_is_divisible_by_3(int number) {
        String result = FizzBuzz.isFizzBuzzNumber(number);

        Assertions.assertEquals("Fizz", result);
    }

    @Test
    void should_return_buzz_when_number_is_5() {
        String result = FizzBuzz.isFizzBuzzNumber(5);

        Assertions.assertEquals("Buzz", result);
    }

}