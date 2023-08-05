// Desarrollado por Victor Manuel Morales Hoyos - vmmorales@unicauca.edu.co
// Taller 1 Ejercicio 29
package logicaNegocio;

public class Functions {
    // Declaracion de Variables
    int[] array = { 10, 2, 45, 67, 23, 103, 89, 4 };

    // Operaciones
    // Algoritmo de Fuerza Bruta
    public int findLargestNumber(int[] array) {
        int largestNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largestNumber) {
                largestNumber = array[i];
            }
        }
        return largestNumber;
    }

    public void runOperations() {
        System.out.println("Ejercicio 29");
        int result = findLargestNumber(array);
        System.out.println("El numero mas grande del array:");
        System.out.print("[ ");
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.print(" ]");
        System.out.println("\nEs: "+result+" ");
    }
}

