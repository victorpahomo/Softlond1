// Desarrollado por Victor Manuel Morales Hoyos - vmmorales@unicauca.edu.co
// Taller 1 Ejercicio 5
package logicaNegocio;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Functions {
    // Instanciamiento de Objetos
    Scanner sc = new Scanner(System.in);
    // Declaracion de Variables
    int num1,num2;
    public void getData() {
        System.out.println("Ejercicio 5\nIngrese el primer numero...");
        num1 = validateData();
        System.out.println("Ingrese el segundo numero");
        num2 = validateData();
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
    public int validateNumBigger(int num1,int num2){
        if (num1 > num2){
            return num1;
        }else {
            return num2;
        }
    }

    public void runOperations() {
        int numBigger = validateNumBigger(num1,num2);
        System.out.println("El numero mayor es: "+numBigger);
    }

}
