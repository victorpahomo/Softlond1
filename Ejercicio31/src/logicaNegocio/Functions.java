// Desarrollado por Victor Manuel Morales Hoyos - vmmorales@unicauca.edu.co
// Taller 1 Ejercicio 31
package logicaNegocio;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Functions {
    // Declaracion de Variables
    int[] array = { 64, 34, 25, 12, 22, 11, 90 };

    // Operaciones
    // Algoritmo de burbuja

    public static int[] bubbleSort(int[] array) {
        int[] newArray = array;
        int n = newArray.length;
        boolean isSorted;
        for (int i = 0; i < n - 1; i++) {
            isSorted = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (newArray[j] > newArray[j + 1]) {
                    // Swap the elements
                    int temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                    isSorted = false;
                }
            }
            // Si el array ya esta ordenado salimos del bucle
            if (isSorted) {
                break;
            }
        }
        return newArray;
    }

public void runOperations() {
        System.out.println("Ejercicio 31");
        int[] result = bubbleSort(array);
        System.out.println("Array original: "+ Arrays.toString(array));
        System.out.println("Array ordenado: "+Arrays.toString(result));
    }
}

