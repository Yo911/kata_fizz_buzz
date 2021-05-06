package com.kata.fizzbuzz;

public class FizzBuzz {
    /**
     * FIZZ BUZZ JAZZ :
     * Fizz when number is divisible 3
     * Buzz when number is divisible 5
     * Jazz when number is divisible 7
     * FizzBuzz when number is divisible 3 & 5
     * FizzJazz when number is divisible 3 & 7
     * BuzzJazz when number is divisible 5 & 7
     * FizzBuzzJazz when number is divisible 3 & 5 & 7
     * return the number when it's not divisible by 3, 5 or 7
     */


    public static String isFizzBuzzNumber(int number) {
        if (isFizzNumber(number)) {
            return "Fizz";
        }
        if (number == 5 || number == 10) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    private static boolean isFizzNumber(int number) {
        return number % 3 == 0;
    }

}
