package de.m4dhouse.calculator.tests;

import de.m4dhouse.calculator.fraction.Fraction;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Project: fraction-calculator
 * Package: de.m4dhouse.calculator.tests
 * Copyright: Hendrik Rombach, 2016
 */
public class FractionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @org.junit.Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @org.junit.After
    public void tearDown() throws Exception {
        System.setErr(null);
        System.setOut(null);
    }

    @org.junit.Test
    public void display() throws Exception {
        Fraction testFraction = new Fraction(5, 4);
        testFraction.display();

        assertEquals("5/4\r\n", outContent.toString());
    }

    @org.junit.Test
    public void testToString() throws Exception {
        Fraction testFraction = new Fraction(5, 4);
        String fractionString = testFraction.toString();

        assertEquals("Franction(5,4) should be printed as \"5/4\"" ,"5/4", fractionString);
    }

    @org.junit.Test
    public void getDenominator() throws Exception {
        Fraction testFraction = new Fraction(5, 4);

        assertEquals("getDenominator() should return int(4)", 4, testFraction.getDenominator());
    }

    @org.junit.Test
    public void setDenominator() throws Exception {
        Fraction testFraction = new Fraction();
        try {
            testFraction.setDenominator(0);
        } catch (Exception e) {
            assertEquals("fraction denominator cannot be 0.", e.getMessage());
        }

        testFraction.setDenominator(5);
        assertEquals("Denominator should now be int(5)", 5, testFraction.getDenominator());
    }

    @org.junit.Test
    public void getNumerator() throws Exception {
        Fraction testFraction = new Fraction(4, 3);

        assertEquals("getNumberator should return int(4)", 4, testFraction.getNumerator());
    }

    @org.junit.Test
    public void setNumerator() throws Exception {
        Fraction testFraction = new Fraction();
        testFraction.setNumerator(5);

        assertEquals("Numerator should now be int(5)", 5, testFraction.getNumerator());
    }

}