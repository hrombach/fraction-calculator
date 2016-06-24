package de.m4dhouse.calculator.gui;
import javax.swing.*;
import java.awt.*;

/**
 * project     fraction-calculator
 * package     de.m4dhouse.calculator.Fraction
 * copyright   (C) Fabian Lehmann 2016
 * version     1.0.0
 * author      Fabian Lehmann <fabian.lehmann@gmail.com>
 */
public class FractionGui {

    public FractionGui() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(800, 600));
        frame.setTitle("Fraction Calculator");

        JPanel panel = new JPanel();

        panel.setVisible(true);

        frame.setVisible(true);

    }
}
