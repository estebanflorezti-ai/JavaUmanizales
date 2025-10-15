package arrays_exercises;

import utils.Utility;
import javax.swing.*;

public class Exercise7 {
    public static void execute() {
        final int CANTIDAD_NUMEROS = 10;
        

        int[] numeros = Utility.readIntegerArray("Ingrese número ", CANTIDAD_NUMEROS);
        

        int[] resultado = encontrarPosicionMayorSumaDigitos(numeros);
        int posicion = resultado[0];
        int numero = resultado[1];
        int sumaDigitos = resultado[2];

        mostrarResultado(numeros, posicion, numero, sumaDigitos);
    }
    
    private static int[] encontrarPosicionMayorSumaDigitos(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            return new int[]{-1, 0, 0};
        }
        
        int posicion = 0;
        int maxSuma = Utility.sumOfDigits(numeros[0]);
        int numero = numeros[0];
        
        for (int i = 1; i < numeros.length; i++) {
            int sumaActual = Utility.sumOfDigits(numeros[i]);
            if (sumaActual > maxSuma || (sumaActual == maxSuma && i < posicion)) {
                maxSuma = sumaActual;
                posicion = i;
                numero = numeros[i];
            }
        }
        
        return new int[]{posicion, numero, maxSuma};
    }
    
    private static void mostrarResultado(int[] numeros, int posicion, int numero, int sumaDigitos) {
        StringBuilder mensaje = new StringBuilder("Números ingresados: \n");
        mensaje.append(Utility.showArrayInteger(numeros));
        mensaje.append("\nEl número con la mayor suma de dígitos es: ").append(numero)
              .append("\nSe encuentra en la posición: ").append(posicion + 1) // +1 porque los arreglos empiezan en 0
              .append("\nLa suma de sus dígitos es: ").append(sumaDigitos);
        
        JOptionPane.showMessageDialog(null, mensaje.toString());
    }
}
