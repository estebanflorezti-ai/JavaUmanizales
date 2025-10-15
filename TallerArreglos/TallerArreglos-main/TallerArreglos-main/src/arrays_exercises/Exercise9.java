package arrays_exercises;

import utils.Utility;
import javax.swing.*;

public class Exercise9 {
    public static void execute() {
        final int CANTIDAD_NUMEROS = 10;

        int[] numeros = Utility.readIntegerArray("Ingrese número ", CANTIDAD_NUMEROS);

        mostrarNumerosComprendidos(numeros);
    }
    
    private static void mostrarNumerosComprendidos(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            JOptionPane.showMessageDialog(null, "No hay números para mostrar.");
            return;
        }
        
        StringBuilder resultado = new StringBuilder("Números comprendidos entre 1 y cada número:\n\n");
        
        for (int i = 0; i < numeros.length; i++) {
            int numeroActual = numeros[i];
            resultado.append("Número ").append(numeroActual).append(": ");
            
            if (numeroActual >= 1) {
                // Mostrar números de 1 a numeroActual
                for (int j = 1; j <= numeroActual; j++) {
                    resultado.append(j);
                    if (j < numeroActual) {
                        resultado.append(", ");
                    }
                }
            } else {
                // Para números menores a 1, mostrarlos en orden descendente
                for (int j = 1; j >= numeroActual; j--) {
                    resultado.append(j);
                    if (j > numeroActual) {
                        resultado.append(", ");
                    }
                }
            }
            
            resultado.append("\n\n");
        }

        JTextArea textArea = new JTextArea(resultado.toString(), 20, 30);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        JOptionPane.showMessageDialog(null, scrollPane, "Números comprendidos", JOptionPane.INFORMATION_MESSAGE);
    }
}
