// Desarrollado por Victor Manuel Morales Hoyos - vmmorales@unicauca.edu.co
// Taller 1 Ejercicio 32
package logicaNegocio;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Functions {
    // Instanciamiento de Objetos
    Scanner sc = new Scanner(System.in);
    // Declaracion de Variables
    int[] array = { 10, 25, 18, 11, 29, 8, 4 };
    int num;
    public void getData() {
        System.out.println("Ejercicio 32");
        System.out.println("Array: "+ Arrays.toString(array));
        System.out.println("Ingrese el numero a buscar...");
        num = validateData();
        sc.close();
    }
    public int validateData() {
        int number;
        while (true) {
            try {
                number = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese numero válido:");
                sc.nextLine(); // Limpiar el buffer del scanner
            }
        }
        return number;
    }
    // Operaciones
    // Algoritmo de Fuerza bruta
    public int searchElement(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return i;
            }
        }
        return -1;
    }

public void runOperations() {
        int result = searchElement(array,num);
        if (result == -1){
            System.out.println("No se encontró el numero: "+num+" en el array");
        }else {
            System.out.println("El numero: "+num+" se econtró en la posición: "+result);
        }
    }
}

