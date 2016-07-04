package de.m4dhouse.calculator.gui;

import javax.swing.*;
import java.awt.*;

/**
 * project     fraction-calculator
 * package     de.m4dhouse.calculator.fraction
 * copyright   (C) Fabian Lehmann 2016
 * version     1.0.0
 * author      Fabian Lehmann <fabian.lehmann@gmail.com>
 */
public class FractionGui {

    public static void main(String[] args){
        new FractionGui();

    }



    public FractionGui() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(800, 600));
        frame.setTitle("fraction Calculator");



        frame.setVisible(true);
    }

}
