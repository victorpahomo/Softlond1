// Desarrollado por Victor Manuel Morales Hoyos - vmmorales@unicauca.edu.co
// Taller 1 Ejercicio 28
package logicaNegocio;

public class Functions {
    // Declaracion de Variables
    int[] array = { 1, 11, 23, 4, 5, 9, 3, 2, 2, 3 };

    // Operaciones
    public int calculateArraySum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    public void runOperations() {
    	System.out.println("Ejercicio 29");
        int result = calculateArraySum(array);
        System.out.println("la suma del array:");
        System.out.print("[ ");
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.print(" ]");
        System.out.println("\nEs: "+result+" ");
    }
}

