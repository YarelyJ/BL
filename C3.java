package com.tesji.formulariotda;

import javax.swing.*;

public class C3 {
    public static void main (String [] args){
        byte ld=Byte.parseByte(JOptionPane.showInputDialog("Ingresa el valor del lado del cuadrado"));
        byte sup = (byte) (ld*4);
        JOptionPane.showMessageDialog(null, "El perimetro del cuadrado es: " + sup);
    }
}
