package de.m4dhouse.calculator.gui;

import javax.swing.*;

/**
 * project     fraction-calculator
 * package     de.m4dhouse.calculator.gui
 * copyright   (C) Fabian Lehmann 2016
 * version     1.0.0
 * author      Fabian Lehmann <fabian.lehmann@gmail.com>
 */
public class test {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton calculateButton;
    private JLabel errors;
    private JComboBox comboBox1;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("test");
        frame.setContentPane(new test().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
