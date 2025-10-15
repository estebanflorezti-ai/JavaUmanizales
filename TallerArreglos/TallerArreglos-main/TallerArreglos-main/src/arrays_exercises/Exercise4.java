package arrays_exercises;

import utils.Utility;
import javax.swing.*;

public class Exercise4 {
    public static void execute() {

        int[] numeros = Utility.readIntegerArray("Ingrese número ", 10);

        StringBuilder posiciones = new StringBuilder("Posiciones de números terminados en 4:\n");
        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 10 == 4) {
                posiciones.append("Posición ").append(i + 1).append(": ").append(numeros[i]).append("\n");
                encontrado = true;
            }
        }

        if (encontrado) {
            JOptionPane.showMessageDialog(null, posiciones.toString());
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron números terminados en 4.");
        }
    }
}
