package com.tesji.formulariotda;
import javax.swing.JOptionPane;

public class C2 {
    public static void main (String [] args){
        int num1=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el 1er numéro"));
        int num2=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el 2do numéro"));
        JOptionPane.showMessageDialog(null, "Suma: " + (num1 + num2) + "Producto: " + (num1 *  num2));
    }
}
