// Desarrollado por Victor Manuel Morales Hoyos - vmmorales@unicauca.edu.co
// Taller 1 Ejercicio 14
package logicaNegocio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Functions {
    // Instanciamiento de Objetos
    Scanner sc = new Scanner(System.in);
    // Declaracion de Variables
    int num;
    public void getData() {
        System.out.println("Ejercicio 14");
        do {
            System.out.println("Ingrese el numero entero positivo...");
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
    public boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        return sum == num;
    }
    public void runOperations(){
        boolean perfectNumber = isPerfectNumber(num);
        if (perfectNumber){
            System.out.println("El numero: "+num+" es PERFECTO");
        }else {
            System.out.println("El numero: "+num+" NO es PERFECTO");
        }
    }
}
