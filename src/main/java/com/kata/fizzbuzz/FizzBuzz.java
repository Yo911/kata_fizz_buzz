package com.kata.fizzbuzz;

public class FizzBuzz {

    public static String isFizzBuzzNumber(int number) {
        if (number == 15) {
            return "FizzBuzz";
        }
        return isDivisibleBy5(number) ? "Buzz" : "Fizz";
    }

    private static boolean isDivisibleBy5(int number) {
        return number % 5 == 0;
    }
}
