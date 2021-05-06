package com.kata.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.kata.fizzbuzz.FizzBuzz.*;

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

        Assertions.assertEquals(FIZZ, result);
    }

    @ParameterizedTest(name = "#{index} - should return buzz when number is {0}")
    @ValueSource(ints = {5, 10, 20, 25, 50})
    void should_return_buzz_when_number_is_divisible_by_5(int number) {
        String result = FizzBuzz.isFizzBuzzNumber(number);

        Assertions.assertEquals(BUZZ, result);
    }

    @ParameterizedTest(name = "#{index} - should return fizzbuzz when number is {0}")
    @ValueSource(ints = {15, 30, 45, 60, 75})
    void should_return_fizzbuzz_when_number_is_divisible_by_3_and_5(int number) {
        String result = FizzBuzz.isFizzBuzzNumber(number);

        Assertions.assertEquals(FIZZ + BUZZ, result);
    }

    @Test
    void  should_return_jazz_when_number_is_7() {
        String result = FizzBuzz.isFizzBuzzNumber(7);

        Assertions.assertEquals(JAZZ, result);
    }

    @Test
    void  should_return_jazz_when_number_is_14() {
        String result = FizzBuzz.isFizzBuzzNumber(14);

        Assertions.assertEquals(JAZZ, result);
    }

}