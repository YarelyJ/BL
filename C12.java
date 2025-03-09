package com.tesji.formulariotda;
import javax.swing.JOptionPane;
public class C12 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número positivo de uno o dos dígitos:"));
        if (num >= 1 && num <= 9) {
            JOptionPane.showMessageDialog(null, "El número tiene un dígito.");
        } else if (num >= 10 && num <= 99) {
            JOptionPane.showMessageDialog(null, "El número tiene dos dígitos.");
        } else {
            JOptionPane.showMessageDialog(null, "Número fuera del rango especificado.");
        }
    }
}
