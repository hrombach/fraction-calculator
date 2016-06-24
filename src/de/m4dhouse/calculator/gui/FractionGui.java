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

    private JPanel createInputPanel(){
        JPanel p1 = new JPanel();
        p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));

        JTextField tf1 = new JTextField();
        JTextField tf2 = new JTextField();
        tf1.setSize(new Dimension(10,30));
        tf2.setSize(new Dimension(10,30));

        JLabel l1 = new JLabel("--");

        p1.add(tf1);
        p1.add(l1);
        p1.add(tf2);
        return p1;
    }
}
