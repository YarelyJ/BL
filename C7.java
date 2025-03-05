package com.tesji.formulariotda;

import javax.swing.*;

public class C7 {
    public static void main(String[] args) {
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso (kg):"));
        double estatura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la estatura (m):"));
        double imc = peso / (estatura * estatura);
        JOptionPane.showMessageDialog(null, "IMC: " + imc);
    }
}

