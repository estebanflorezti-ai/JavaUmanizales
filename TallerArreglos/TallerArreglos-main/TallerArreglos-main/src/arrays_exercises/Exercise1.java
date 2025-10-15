package arrays_exercises;

import utils.Utility;
import javax.swing.*;

public class Exercise1 {
    public static void execute() {

        int[] numeros = Utility.readIntegerArray("Ingrese número ", 10);
        

        int posicionMayor = 0;
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > numeros[posicionMayor]) {
                posicionMayor = i;
            }
        }
        

        JOptionPane.showMessageDialog(null, 
            "El mayor número está en la posición: " + (posicionMayor + 1) + 
            "\nNúmero: " + numeros[posicionMayor]);
    }
}
