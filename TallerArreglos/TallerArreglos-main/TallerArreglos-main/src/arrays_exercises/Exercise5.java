package arrays_exercises;

import utils.Utility;
import javax.swing.*;

public class Exercise5 {
    public static void execute() {
        final int CANTIDAD_NUMEROS = 10;

        int[] numeros = Utility.readIntegerArray("Ingrese número ", CANTIDAD_NUMEROS);

        int[] resultado = encontrarMayorYConteo(numeros);
        int mayor = resultado[0];
        int conteo = resultado[1];

        mostrarResultado(mayor, conteo);
    }
    
    private static int[] encontrarMayorYConteo(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            return new int[]{0, 0};
        }
        
        int mayor = numeros[0];
        int conteo = 1;
        
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
                conteo = 1;
            } else if (numeros[i] == mayor) {
                conteo++;
            }
        }
        
        return new int[]{mayor, conteo};
    }
    
    private static void mostrarResultado(int mayor, int conteo) {
        String mensaje = String.format(
            "El mayor número es: %d\nEstá repetido %d %s.",
            mayor,
            conteo,
            conteo == 1 ? "vez" : "veces"
        );
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
