package arrays_exercises;

import utils.Utility;
import javax.swing.*;

public class Exercise3 {
    public static void execute() {

        int[] primos = new int[10];
        int count = 0;
        int numero = 100;

        while (count < 10 && numero <= 300) {
            if (Utility.isPrime(numero)) {
                primos[count] = numero;
                count++;
            }
            numero++;
        }

        JOptionPane.showMessageDialog(null, 
            "Los 10 números primos entre 100 y 300 son:\n" + Utility.showArrayInteger(primos));
    }
}
