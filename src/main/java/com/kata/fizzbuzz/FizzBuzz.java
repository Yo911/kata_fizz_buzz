package com.kata.fizzbuzz;

public class FizzBuzz {

    public static String isFizzBuzzNumber(int number) {
        if (isDivisibleBy3AndBy5(number)) {
            return "FizzBuzz";
        }
        if (isDivisibleBy3(number)) {
            return "Fizz";
        }
        return isDivisibleBy5(number) ? "Buzz" : "";
    }

    private static boolean isDivisibleBy3(int number) {
        return number % 3 == 0;
    }

    private static boolean isDivisibleBy3AndBy5(int number) {
        return isDivisibleBy3(number) && isDivisibleBy5(number);
    }

    private static boolean isDivisibleBy5(int number) {
        return number % 5 == 0;
    }
}
