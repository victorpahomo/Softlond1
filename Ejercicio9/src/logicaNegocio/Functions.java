// Desarrollado por Victor Manuel Morales Hoyos - vmmorales@unicauca.edu.co
// Taller 1 Ejercicio 9
package logicaNegocio;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Functions {
    // Instanciamiento de Objetos
    Scanner sc = new Scanner(System.in);
    // Declaracion de Variables
    int num1;
    public void getData() {
        do {
            if (num1 < 0 ){
                System.out.println("El numero tiene que ser positivo");
            }
            System.out.println("Ejercicio 9\nIngrese un numero entero positivo...");
            num1 = validateData();
        }while (num1<0);

    }
    public int validateData() {
        int num;
        while (true) {
            try {
                num = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese numero entero positivo válidos:");
                sc.nextLine(); // Limpiar el buffer del scanner
            }
        }
        return num;
    }
// Operaciones
    // FUNCION RECURSIVA :)
    public int factorial(int num1) {
        if (num1 == 0 || num1 == 1){
            return 1;
        }else {
            return num1 * factorial(num1 - 1);
        }
    }
    public void runOperations() {
        int factorialResult = factorial(num1);
        System.out.println("El factorial de: "+num1+" es: "+factorialResult);
    }
}
