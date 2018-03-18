package assigment05.printer;

import javax.swing.*;

public class Printer {

    public static void print(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public static void print(Object object) {
        JOptionPane.showMessageDialog(null, object.toString());
    }

    public static void printCon(String message) {
        System.out.println(message);
    }

    public static void printCon(Object object) {
        System.out.println(object.toString());
    }
}
