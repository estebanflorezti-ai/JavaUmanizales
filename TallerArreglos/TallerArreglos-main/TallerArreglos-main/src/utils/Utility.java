package utils;

import javax.swing.*;

public class Utility {
    public static int readInteger(String message){

        try{
            return Integer.parseInt(JOptionPane.showInputDialog(message));
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,
                    "No sea bruto le pedí un número");

        }
        return 0;



    }

    public static int[] readIntegerArray(String message, int size){
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = readInteger(message + (i+1));
        }
        return array;
    }

    public static long calculateFactorial(int n){
        long factorial = 1;
        for (int i = 1; i <= n; i++){
            factorial *= i;
        }
        return factorial;
    }

    public static String showArrayInteger(int[] array){
        String  result = "";
        for(int i = 0; i < array.length; i++){
            result += array[i] + " \n";
        }
        return result;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static int calculateIntegerAverage(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static boolean contains(int[] array, int value) {
        if (array == null) {
            return false;
        }
        for (int num : array) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }
    
    public static int sumOfDigits(int number) {
        int sum = 0;
        // Convert to positive to handle negative numbers correctly
        int num = Math.abs(number);
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
