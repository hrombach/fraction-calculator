package de.m4dhouse.calculator.Fraction;

/**
 * This file is part of de.m4dhouse.calculator.Fraction, included in g18.AE03.java.calculator.
 * Created by hromb on 6/24/2016.
 * It is licensed under the GNU General Public License
 */
class ZeroDenominatorException extends Exception {
    ZeroDenominatorException() {
        super("Fraction denominator cannot be 0.");
    }
}
