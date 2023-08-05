// Desarrollado por Victor Manuel Morales Hoyos - vmmorales@unicauca.edu.co
// Taller 1 Ejercicio 2
package logicaNegocio;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Functions {
    // Instanciamiento de Objetos
    Scanner sc = new Scanner(System.in);
    // Declaracion de Variables
    int num1;
    public void getData() {
        System.out.println("Ejercicio 2\nIngrese el numero a validar si es par o impar...");
        num1 = validateData();
    }
    public int validateData() {
        int num;
        while (true) {
            try {
                num = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número entero válido:");
                sc.nextLine(); // Limpiar el buffer del scanner
            }
        }
        return num;
    }
// Operaciones
    public void runOperations(){
        if(num1 % 2 == 0){
            System.out.println("El numero "+num1+" es PAR");
        }
        else {
            System.out.println("El numero "+num1+" es IMPAR");
        }
    }


}
