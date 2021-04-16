package com.kata.fractions;

public class Fration {

    static int gcd(int a, int b)
    {
        return b == 0 ? a : gcd(b, a % b);
    }

}
