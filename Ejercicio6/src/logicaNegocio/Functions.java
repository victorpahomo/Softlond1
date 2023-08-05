// Desarrollado por Victor Manuel Morales Hoyos - vmmorales@unicauca.edu.co
// Taller 1 Ejercicio 6
package logicaNegocio;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Functions {
    // Instanciamiento de Objetos
    Scanner sc = new Scanner(System.in);
    // Declaracion de Variables
    int num1;
    public void getData() {
        System.out.println("Ejercicio 6\nIngrese un numero...");
        num1 = validateData();
    }
    public int validateData() {
        int num;
        while (true) {
            try {
                num = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese numeros enteros válidos:");
                sc.nextLine(); // Limpiar el buffer del scanner
            }
        }
        return num;
    }
// Operaciones
    public int validateNumRange() {
        return Integer.compare(num1, 0);
    }

    public void runOperations() {
        int numValidation = validateNumRange();
        switch (numValidation) {
            case 0:
                System.out.println("El numero es igual a cero");
                break;
            case 1:
                System.out.println("El numero es positivo");
                break;
            case -1:
                System.out.println("El numero es negativo");
                break;
        }
    }

}
