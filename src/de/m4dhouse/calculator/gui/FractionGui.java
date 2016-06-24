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


        frame.add(this.createInputPanel());
        frame.add(this.createOpsDropdown());
        frame.add(this.createInputPanel());
        frame.setVisible(true);
    }

    private JPanel createInputPanel(){
        JPanel p = new JPanel();
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

        JTextField tf1 = new JTextField();
        JTextField tf2 = new JTextField();
        tf1.setSize(new Dimension(10,30));
        tf2.setSize(new Dimension(10,30));

        JLabel l1 = new JLabel("--");

        p.add(tf1);
        p.add(l1);
        p.add(tf2);
        return p;
    }

    private JPanel createOpsDropdown(){
        JPanel p = new JPanel();
        String operations[] = {"+","-","*","/"};
        JList list = new JList(operations);

        p.add(list);
        return p;
    }
}
