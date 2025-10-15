package arrays_exercises;

import utils.Utility;
import javax.swing.*;

public class Exercise6 {
    public static void execute() {
        final int CANTIDAD_NUMEROS = 10;

        int[] numeros = Utility.readIntegerArray("Ingrese número ", CANTIDAD_NUMEROS);

        int promedio = Utility.calculateIntegerAverage(numeros);

        boolean promedioEnArreglo = Utility.contains(numeros, promedio);

        mostrarResultado(numeros, promedio, promedioEnArreglo);
    }
    
    private static void mostrarResultado(int[] numeros, int promedio, boolean encontrado) {
        StringBuilder mensaje = new StringBuilder("Números ingresados: \n");
        mensaje.append(Utility.showArrayInteger(numeros));
        mensaje.append("\nPromedio entero: ").append(promedio).append("\n");
        
        if (encontrado) {
            mensaje.append("El promedio SÍ se encuentra en el arreglo.");
        } else {
            mensaje.append("El promedio NO se encuentra en el arreglo.");
        }
        
        JOptionPane.showMessageDialog(null, mensaje.toString());
    }
}
