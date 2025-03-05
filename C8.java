package com.tesji.formulariotda;
import javax.swing.JOptionPane;
public class C8 {
    public static void main(String[] args) {
        double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo:"));
        if (sueldo > 3000) {
            JOptionPane.showMessageDialog(null, "Debe abonar impuestos.");
        }
    }
}
