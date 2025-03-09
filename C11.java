package com.tesji.formulariotda;
import javax.swing.JOptionPane;
public class C11 {
    public static void main(String[] args) {
        double sumaN = 0;
        double prom;
        for (int i = 1; i <= 3; i++) {
            sumaN += Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota " + i + ":"));
        }
        prom = sumaN / 3;
        JOptionPane.showMessageDialog(null, "Promedio: " + prom + (prom >= 7 ? "\nAprobado" : "\nNo aprobado"));
    }
}
