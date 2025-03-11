package com.tesji.formulariotda;
import javax.swing.JOptionPane;
public class C13 {
    public static void main(String[] args) {
        String clave = JOptionPane.showInputDialog("Ingrese la clave:");
        if ("yare123".equals(clave)) {
            JOptionPane.showMessageDialog(null, "Acceso concedido.");
        } else {
            JOptionPane.showMessageDialog(null, "Clave incorrecta.");
        }
    }
}
