package com.kata.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";

    public static final String BUZZ = "Buzz";

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
        if (isFizzBuzz(number)) {
            return FIZZ + BUZZ;
        }
        if (isFizzNumber(number)) {
            return FIZZ;
        }
        if (isBuzzNumber(number)) {
            return BUZZ;
        }
        return String.valueOf(number);
    }

    private static boolean isFizzBuzz(int number) {
        return isFizzNumber(number) && isBuzzNumber(number);
    }

    private static boolean isBuzzNumber(int number) {
        return isDivisibleBy(number, 5);
    }

    private static boolean isFizzNumber(int number) {
        return isDivisibleBy(number, 3);
    }

    private static boolean isDivisibleBy(int number, int denominator) {
        return number % denominator == 0;
    }

}
