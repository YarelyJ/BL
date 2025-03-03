package com.tesji.formulariotda;

import javax.swing.*;

public class C6 {
    public static void main (String [] args) {
        double prec=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio del articulo"));
        double cant=Double.parseDouble(JOptionPane.showInputDialog("Cantidad"));
        JOptionPane.showMessageDialog(null, "Total a pagar: " + (prec * cant));
    }
}
