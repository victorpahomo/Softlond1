// Desarrollado por Victor Manuel Morales Hoyos - vmmorales@unicauca.edu.co
// Taller 1 Ejercicio 34
package logicaNegocio;

import java.util.Arrays;
import java.util.Map;

public class Functions {
    // Declaracion de Variables
    int[] array = { 1, 2, 3, 4, 5, 6, 7 };
    int rotations = 2;// Cantidas elegida de rotaciones
    // Operaciones
    // Algoritmo de intercambio
    public int[] rotateArray(int[] array, int rotations) {
        int length = array.length; //Tamaño del array
        int[] rotatedArray = new int[length]; // Nuevo array del mismo tamaño

        for (int i = 0; i < length; i++) {
            int newPosition = (i + rotations) % length; // Formula para ubicar la nueva posicion
            if (newPosition < 0) { // si es menos a 0
                newPosition += length;
            }
            rotatedArray[newPosition] = array[i];
        }
        return rotatedArray;
    }

    public void runOperations() {
        System.out.println("Ejercicio 34");
        System.out.println("Array original: "+Arrays.toString(array));
        System.out.println("Cantidad de rotaciones elegidas: "+rotations);
        int[] resultArray = rotateArray(array,rotations);
        System.out.println("Nuevo array: "+Arrays.toString(resultArray));

    }
}

