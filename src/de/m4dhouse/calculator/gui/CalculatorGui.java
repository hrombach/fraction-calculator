package de.m4dhouse.calculator.gui;

import javax.swing.*;
import java.awt.*;

/**
 * project     fraction-calculator
 * package     de.m4dhouse.calculator.gui
 * copyright   (C) Fabian Lehmann 2016
 * version     1.0.0
 * author      Fabian Lehmann <fabian.lehmann@gmail.com>
 */
public class CalculatorGui {
    private JButton button1;
    private JTextField textField2;
    private JComboBox comboBox1;
    private JTextField textField3;
    private JTextField textField4;
    private JPanel panel1;

    public static void main(String[] args ){
        JFrame frame = new JFrame();
        frame.setContentPane(new CalculatorGui().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private String getSelectedOp(){
        String op = "";


        return op;
    }

}
