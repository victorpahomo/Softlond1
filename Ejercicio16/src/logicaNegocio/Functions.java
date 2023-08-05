// Desarrollado por Victor Manuel Morales Hoyos - vmmorales@unicauca.edu.co
// Taller 1 Ejercicio 16
package logicaNegocio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Functions {
    // Instanciamiento de Objetos
    Scanner sc = new Scanner(System.in);
    // Declaracion de Variables
    int num;
    public void getData() {
        System.out.println("Ejercicio 16");
        do {
            System.out.println("Ingrese el numero de iteraciones que desea de la serie fibonacci...");
            num = validateData();
            if (num < 0) {
                System.out.println("El numero tiene que ser positivo");
            }
        } while (num < 0 );
        sc.close();
    }
    public int validateData() {
        int number;
        while (true) {
            try {
                number = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese numero entero válido:");
                sc.nextLine(); // Limpiar el buffer del scanner
            }
        }
        return number;
    }
    // Operaciones
    public int fibonacci(int num) {
        if (num <= 1 ){
            return num;
        }else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
    public void runOperations() {
        int maxNumber = num; // Se puede cambiar este numero si se quieren mas ejecuciones
        System.out.println("Serie Fibonacci con "+num+" iteraciones");
        for (int i = 0; i < maxNumber; i++){
            System.out.println(fibonacci(i)+" ");
        }
    }
}
