package de.m4dhouse.calculator;

import de.m4dhouse.calculator.fraction.Fraction;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Fraction fraction1 = new Fraction(1, 2);
            Fraction fraction2 = new Fraction(3, 5);
            System.out.println("Bruch 1: " + fraction1);
            System.out.println("Bruch 1: " + fraction2);
            System.out.println("\n");
            System.out.println("welche Operation möchten sie durchführen?");
            String op = "";
            System.out.println( );
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();

            System.out.println("+\n" + "-\n" + "x\n" + "/\n");
            String currOp = "";
            op = sc.nextLine();
            Fraction y = new Fraction();
            switch(op){
                case "+": currOp = "+";
                    System.out.println("Sie habe die Operatrion: " + currOp);
                    break;
                case "-": currOp = "-";
                    System.out.println("Sie habe die Operatrion: " + currOp);

                    break;
                case "x": currOp = "x";
                    System.out.println("Sie habe die Operatrion: " + currOp);
                    y = fraction1.mul(fraction2);
                    break;
                case "/": currOp = "/";
                    System.out.println("Sie habe die Operatrion: " + currOp);
                    y = fraction1.div(fraction2);
                    break;
            }

            System.out.println();

            System.out.println(fraction1 + " " + currOp + " " + fraction2);

            System.out.println();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
