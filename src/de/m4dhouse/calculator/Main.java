package de.m4dhouse.calculator;

import de.m4dhouse.calculator.fraction.Fraction;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        boolean guimode = false;
        for (String arg : args) {
            if (arg.equals("guimode")) {
                guimode = true;
            }
        }
        if (guimode) {
            JOptionPane.showMessageDialog(
                    new JFrame(),
                    "GUI Mode is not yet ready.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                                         );
        }
        try {
            Fraction fraction = new Fraction(1, 2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
