package com.tesji.formulariotda;
import javax.swing.JOptionPane;
public class C10 {
    public static void main(String[] args) {
        int l = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));
        if (l > b) {
            JOptionPane.showMessageDialog(null, "Suma: " + (l + b) + "\nDiferencia: " + (l - b));
        } else {
            JOptionPane.showMessageDialog(null, "Producto: " + (l * b) + "\nDivisión: " + (b != 0 ? (l / (double) b) : "No válida (divisor es cero)."));
        }
    }
}
