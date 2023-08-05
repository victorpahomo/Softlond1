// Desarrollado por Victor Manuel Morales Hoyos - vmmorales@unicauca.edu.co
// Taller 1 Ejercicio 8
package logicaNegocio;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Functions {
    // Instanciamiento de Objetos
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    // Declaracion de Variables
    int randomNumber = random.nextInt(100) + 1; // Genera un número aleatorio entre 1-100
    int num1;
    public void getData() {
        do {
            if (num1 < 1 || num1 >100){
                System.out.println("Numeros entre 1 y 100");
            }
            System.out.println("Ejercicio 8\n Adivine el numero que genere aleatorio entre 1 y 100...");
            num1 = validateData();
        }while (num1<1 || num1>100);
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
    // Valida si el numero introducido es mayoy, menor o igual
    public void validateOption(int userGuess, int randomNumber) {
        if (userGuess == randomNumber) {
            System.out.println("LO ENCONTRASTE! "+userGuess+" es el numero.");
        } else if (userGuess > randomNumber) {
            System.out.println("Nop, el numero que ingresaste es mayor");
        } else {
            System.out.println("Nop, el numero que ingresaste es menor");
        }
    }
    public void runOperations() {
        validateOption(num1,randomNumber);
    }
}
