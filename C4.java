package com.tesji.formulariotda;

import javax.swing.*;

public class C4 {
    public static void main(String[] args) {
        byte num1 = Byte.parseByte(JOptionPane.showInputDialog("Ingresa el primer numero"));
        byte num2 = Byte.parseByte(JOptionPane.showInputDialog("Ingresa el segundo numero"));
        byte num3 = Byte.parseByte(JOptionPane.showInputDialog("Ingresa el tercer numero"));
        byte num4 = Byte.parseByte(JOptionPane.showInputDialog("Ingresa el cuarto numero"));
        JOptionPane.showMessageDialog(null, "Suma de los primeros dos números: " + (num1 + num2) + "Producto de los dos numeros restanter: " + (num3 * num4));
    }
}

