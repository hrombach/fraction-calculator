package de.m4dhouse.calculator.fraction;

/**
 * This file is part of de.m4dhouse.calculator.fraction, included in g18.AE03.java.calculator.
 * Created by hromb on 6/24/2016.
 * It is licensed under the GNU General Public License
 */
class ZeroDenominatorException extends Exception {

    ZeroDenominatorException() {
        super("fraction denominator cannot be 0.");
    }
}
