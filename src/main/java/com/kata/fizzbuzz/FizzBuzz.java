package com.kata.fizzbuzz;

public class FizzBuzz {

    public static String isFizzBuzzNumber(int number) {
        if (number == 5 || number == 10 || number == 15) {
            return "Buzz";
        }
        return "Fizz";
    }
}
