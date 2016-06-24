package de.m4dhouse.calculator;

import de.m4dhouse.calculator.Fraction.Fraction;

public class Main {

    public static void main(String[] args) {
        try {
            Fraction fraction = new Fraction(1, 2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
