package de.m4dhouse.calculator.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * project     fraction-calculator
 * package     de.m4dhouse.calculator.gui
 * copyright   (C) Fabian Lehmann 2016
 * version     1.0.0
 * author      Fabian Lehmann <fabian.lehmann@gmail.com>
 */
public class CalculatorGui implements ActionListener{
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

    public CalculatorGui() {
        this.getButton1().addActionListener(this);
        button1.addActionListener(this);

    }

    public JButton getButton1() {
        return button1;
    }

    public void setButton1(JButton button1) {
        this.button1 = button1;
    }

    public JTextField getTextField2() {
        return textField2;
    }

    public void setTextField2(JTextField textField2) {
        this.textField2 = textField2;
    }

    public JComboBox getComboBox1() {
        return comboBox1;
    }

    public void setComboBox1(JComboBox comboBox1) {
        this.comboBox1 = comboBox1;
    }

    public JTextField getTextField3() {
        return textField3;
    }

    public void setTextField3(JTextField textField3) {
        this.textField3 = textField3;
    }

    public JTextField getTextField4() {
        return textField4;
    }

    public void setTextField4(JTextField textField4) {
        this.textField4 = textField4;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.getButton1()){
         //Calculate

        }
    }
}
