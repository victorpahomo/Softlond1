// Desarrollado por Victor Manuel Morales Hoyos - vmmorales@unicauca.edu.co
// Taller 1 Ejercicio 15
package logicaNegocio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Functions {
    // Instanciamiento de Objetos
    Scanner sc = new Scanner(System.in);
    // Declaracion de Variables
    int num;
    public void getData() {
        System.out.println("Ejercicio 15");
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
    public boolean isCapicua(int num) {
        int originalNumber = num;
        int reversedNumber = 0;
        while (num != 0) {
            int digito = num % 10;
            reversedNumber = reversedNumber * 10 + digito;
            num /= 10;
        }
        return originalNumber == reversedNumber;
    }
    public void runOperations(){
        boolean capicua = isCapicua(num);
        if (capicua){
            System.out.println("El numero: "+num+" es CAPICUA");
        }else {
            System.out.println("El numero: "+num+" NO es CAPICUA");
        }
    }
}
