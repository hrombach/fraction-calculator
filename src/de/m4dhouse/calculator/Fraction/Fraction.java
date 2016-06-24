package de.m4dhouse.calculator.Fraction;

/**
 * This file is part of de.m4dhouse.calculator.Fraction, included in g18.AE03.java.calculator.
 * Created by hromb on 6/24/2016.
 * It is licensed under the GNU General Public License
 */
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) throws ZeroDenominatorException {
        if (denominator == 0) {
            throw new ZeroDenominatorException();
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void display() {
        System.out.println(toString());
    }

    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) throws ZeroDenominatorException {
        if (denominator <= 0) {
            throw new ZeroDenominatorException();
        }

        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
}
