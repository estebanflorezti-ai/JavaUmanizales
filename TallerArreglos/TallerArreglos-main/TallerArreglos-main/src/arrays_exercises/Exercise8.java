package arrays_exercises;

import utils.Utility;
import javax.swing.*;

public class Exercise8 {
    public static void execute() {
        final int CANTIDAD_NUMEROS = 10;

        int[] numeros = Utility.readIntegerArray("Ingrese número ", CANTIDAD_NUMEROS);

        long[] factoriales = calcularFactoriales(numeros);

        mostrarResultados(numeros, factoriales);
    }
    
    private static long[] calcularFactoriales(int[] numeros) {
        if (numeros == null) {
            return new long[0];
        }
        
        long[] factoriales = new long[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            // Usamos el método calculateFactorial de la clase Utility
            factoriales[i] = Utility.calculateFactorial(Math.abs(numeros[i]));
        }
        return factoriales;
    }
    
    private static void mostrarResultados(int[] numeros, long[] factoriales) {
        if (numeros == null || factoriales == null || numeros.length != factoriales.length) {
            JOptionPane.showMessageDialog(null, "Error: No se pueden mostrar los resultados");
            return;
        }
        
        StringBuilder mensaje = new StringBuilder("Números y sus factoriales:\n\n");
        mensaje.append(String.format("%-10s %-20s\n", "Número", "Factorial"));
        mensaje.append("-".repeat(30)).append("\n");
        
        for (int i = 0; i < numeros.length; i++) {
            mensaje.append(String.format("%-10d %-20d\n", numeros[i], factoriales[i]));
        }
        
        JOptionPane.showMessageDialog(null, mensaje.toString());
    }
}
