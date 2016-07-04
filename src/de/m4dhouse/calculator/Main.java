package de.m4dhouse.calculator;

import de.m4dhouse.calculator.fraction.Fraction;

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
            System.exit(0);
        }
        try {
            Scanner sc = new Scanner(System.in);
            int x1 = 0, x2 = 0 , y1 = 0, y2 = 0;

            System.out.println("Wählen Sie den ersten Zähler und Nenner");
            System.out.print("Zähler 1: "); if (sc.hasNextInt()){x1 = sc.nextInt();}
            System.out.print("Nenner 1: "); if (sc.hasNextInt()){y1 = sc.nextInt();}

            System.out.println("Wählen Sie den zweiten Zähler und Nenner");
            System.out.print("Zähler 2: "); if (sc.hasNextInt()){x2 = sc.nextInt();}
            System.out.print("Nenner 2: "); if (sc.hasNextInt()){y2 = sc.nextInt();}

            Fraction fraction1 = new Fraction(x1, y1);
            Fraction fraction2 = new Fraction(x2, y2);

            System.out.println("welche Operation möchten sie durchführen?");


            String op = "";

            System.out.println("| + | - | * | / |");
            String currOp = "";
            op = sc.next();
            Fraction y = new Fraction();


            y = op.equals("+") ?
                fraction1.add(fraction2) : op.equals("-") ?
                fraction1.sub(fraction2) : op.equals("*") ?
                fraction1.mul(fraction2) : fraction1.div(fraction2);

            System.out.println(fraction1 + " " + op + " " + fraction2 + " = " + y);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
