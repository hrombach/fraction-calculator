package de.m4dhouse.calculator.fraction;

/**
 * This file is part of de.m4dhouse.calculator.fraction, included in g18.AE03.java.calculator.
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
        if (this.numerator > this.denominator) {
            return (this.numerator / this.denominator) + " " +
                    (this.numerator % this.denominator) + "/" + this.denominator;
        }
        return this.numerator + "/" + this.denominator;
    }

    public Fraction mul(Fraction f2) throws ZeroDenominatorException {
        Fraction result = new Fraction(
                this.getNumerator() * f2.getNumerator(),
                this.getDenominator() * f2.getDenominator()
        );
        return result.simplify();
    }

    public Fraction div(Fraction f2) throws ZeroDenominatorException {
        Fraction result = new Fraction(
                this.getDenominator() * f2.getNumerator(),
                this.getNumerator() * f2.getDenominator()
        );
        return result.simplify();
    }

    public Fraction add(Fraction f2) throws ZeroDenominatorException {
        Fraction result = new Fraction(
                (this.getNumerator() * f2.getDenominator() + f2.getNumerator() * this.getDenominator()),
                (this.getDenominator() * f2.getDenominator()));
        return result.simplify();
    }

    public Fraction sub(Fraction f2) throws ZeroDenominatorException {
        Fraction result = new Fraction(
                (this.getNumerator() * f2.getDenominator() - this.getDenominator() * f2.getNumerator()),
                (this.getDenominator() * f2.getDenominator())
        );
        return result.simplify();
    }

    public Fraction simplify() throws ZeroDenominatorException {
        int gcd = GCD(this.denominator, this.numerator);

        this.numerator = this.numerator / gcd;
        this.denominator = this.denominator / gcd;

        return this;
    }

    private int GCD(int a, int b) {
        if (b == 0) return a;
        return GCD(b, a % b);
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
