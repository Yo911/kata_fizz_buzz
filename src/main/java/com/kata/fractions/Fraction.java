package com.kata.fractions;

public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    void lowest()
    {
        // Finding gcd of both terms
        int common_factor = gcd(this.numerator, this.denominator);

        // Converting both terms into simpler
        // terms by dividing them by common factor
        this.denominator = this.denominator/common_factor;
        this.numerator = this.numerator/common_factor;
    }

    public void add(Fraction fraction2) {
        int commonDenominator = getCommonDenominator(fraction2);

        int numerator1 = getConvertedNumerator(commonDenominator);
        int numerator2 = fraction2.getConvertedNumerator(commonDenominator);

        this.numerator = numerator1 + numerator2;
        this.denominator = commonDenominator;

        int gcd = gcd(this.numerator, this.denominator);
        this.denominator = this.denominator / gcd;
        this.numerator = this.numerator / gcd;
    }

    private int getCommonDenominator(Fraction fraction2) {
        int gcd = gcd(this.denominator, fraction2.denominator);
        int commonDenominator = this.denominator / gcd;
        return this.denominator * fraction2.denominator / commonDenominator;
    }

    private int getConvertedNumerator(int commonDenominator) {
        return this.numerator * (commonDenominator / this.denominator);
    }
}
