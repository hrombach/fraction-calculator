package de.m4dhouse.calculator.tests;

import de.m4dhouse.calculator.fraction.Fraction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Project: fraction-calculator
 * Package: de.m4dhouse.calculator.tests
 * Copyright: Hendrik Rombach, 2016
 */
public class FractionTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void tearDown() throws Exception {
        System.setErr(null);
        System.setOut(null);
    }

    @Test
    public void mul() throws Exception {
        Fraction testFraction1 = new Fraction(2, 5);
        Fraction testFraction2 = new Fraction(4, 3);

        Fraction resultFraction = testFraction1.mul(testFraction2);

        assertEquals("8/15", resultFraction.toString());
    }

    @Test
    public void div() throws Exception {
        Fraction testFraction2 = new Fraction(2, 6);
        Fraction testFraction1 = new Fraction(1, 4);

        Fraction resultFraction = testFraction1.div(testFraction2);

        assertEquals("1 1/3", resultFraction.toString());
    }

    @Test
    public void simplify() throws Exception {
        Fraction testFraction = new Fraction(86, 360);

        assertEquals("43/180", testFraction.simplify().toString());
    }

    @Test
    public void add() throws Exception {
        Fraction testFraction1 = new Fraction(2, 6);
        Fraction testFraction2 = new Fraction(1, 4);

        Fraction resultFraction = testFraction1.add(testFraction2);

        assertEquals("7/12", resultFraction.toString());
    }

    @Test
    public void sub() throws Exception {
        Fraction testFraction1 = new Fraction(2, 6);
        Fraction testFraction2 = new Fraction(1, 4);

        Fraction resultFraction = testFraction1.sub(testFraction2);

        assertEquals("1/12", resultFraction.toString());
    }

    @Test
    public void display() throws Exception {
        Fraction testFraction = new Fraction(4, 6);
        testFraction.display();

        assertEquals("4/6\r\n", outContent.toString());
    }

    @Test
    public void testToString() throws Exception {
        Fraction testFraction = new Fraction(3, 4);

        assertEquals("Franction(3,4) should be printed as \"3/4\"", "3/4", testFraction.toString());

        Fraction testFraction2 = new Fraction(50, 22);

        assertEquals("2 6/22", testFraction2.toString());
    }

    @Test
    public void getDenominator() throws Exception {
        Fraction testFraction = new Fraction(5, 4);

        assertEquals("getDenominator() should return int(4)", 4, testFraction.getDenominator());
    }

    @Test
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

    @Test
    public void getNumerator() throws Exception {
        Fraction testFraction = new Fraction(4, 3);

        assertEquals("getNumberator should return int(4)", 4, testFraction.getNumerator());
    }

    @Test
    public void setNumerator() throws Exception {
        Fraction testFraction = new Fraction();
        testFraction.setNumerator(5);

        assertEquals("Numerator should now be int(5)", 5, testFraction.getNumerator());
    }

}