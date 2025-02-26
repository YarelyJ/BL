package com.tesji.formulariotda;
import javax.swing.JOptionPane;

public class C1 {
    public static void main (String [] args){
        byte ld=Byte.parseByte(JOptionPane.showInputDialog("Ingresa el valor del primer lado"));
        byte sup = (byte) (ld*2);
        JOptionPane.showMessageDialog(null, "La superficie es: " + sup);
    }
}
