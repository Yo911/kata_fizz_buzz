package com.kata.fizzbuzz;

public class FizzBuzz {

    public static String isFizzBuzzNumber(int number) {
        if (isDivisibleBy3AndBy5(number)) {
            return "FizzBuzz";
        }
        if (number == 3) {
            return "Fizz";
        }
        return isDivisibleBy5(number) ? "Buzz" : "";
    }

    private static boolean isDivisibleBy3AndBy5(int number) {
        return number % 5 == 0 && number % 3 == 0;
    }

    private static boolean isDivisibleBy5(int number) {
        return number % 5 == 0;
    }
}
