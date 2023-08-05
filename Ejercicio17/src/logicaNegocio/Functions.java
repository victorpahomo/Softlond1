// Desarrollado por Victor Manuel Morales Hoyos - vmmorales@unicauca.edu.co
// Taller 1 Ejercicio 17
package logicaNegocio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Functions {
    // Instanciamiento de Objetos
    Scanner sc = new Scanner(System.in);
    // Declaracion de Variables
    int num1,num2;
    public void getData() {
        System.out.println("Ejercicio 17");
        do {
            System.out.println("Ingrese el primer numero...");
            num1 = validateData();
            System.out.println("Ingrese el segundo numero...");
            num2 = validateData();
            if (num1 < 1 || num2 < 1) {
                System.out.println("Los numeros tienen que ser positivos");
            }
        } while (num1 < 1 );
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
    // FUNCION RECURSIVA :)
    public boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public void primeNumberOnRange(int num1,int num2){
        for(int i=num1;i<=num2;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public void runOperations() {
        primeNumberOnRange(num1,num2);
    }
}
