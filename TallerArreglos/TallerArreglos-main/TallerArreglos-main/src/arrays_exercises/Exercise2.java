package arrays_exercises;

import utils.Utility;
import javax.swing.*;

public class Exercise2 {
    public static void execute() {

        int[] numeros = Utility.readIntegerArray("Ingrese número ", 10);

        int mayorPrimo = -1;
        int posicionMayorPrimo = -1;
        for (int i = 0; i < numeros.length; i++) {
            if (Utility.isPrime(numeros[i]) && numeros[i] > mayorPrimo) {
                mayorPrimo = numeros[i];
                posicionMayorPrimo = i;
            }
        }
        

        if (posicionMayorPrimo != -1) {
            JOptionPane.showMessageDialog(null, 
                "El mayor número primo está en la posición: " + (posicionMayorPrimo + 1) + 
                "\nNúmero: " + mayorPrimo);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron números primos en el arreglo.");
        }
    }
}
