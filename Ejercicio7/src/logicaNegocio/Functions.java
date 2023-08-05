// Desarrollado por Victor Manuel Morales Hoyos - vmmorales@unicauca.edu.co
// Taller 1 Ejercicio 7
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
            if (num1 <= 0 ){
                System.out.println("El numero tiene que ser positivo y no puede ser cero");
            }
            System.out.println("Ejercicio 7\nIngrese un numero entero positivo...");
            num1 = validateData();
        }while (num1<1);

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
    public void multiplicationTable(int num1) {
        System.out.println("- TABLA DEL "+num1+" -");
        for (int i=1 ; i <= 10 ; i++){
            System.out.println(num1+" * "+i+" = "+(num1*i));
        }
    }
    public void runOperations() {
        multiplicationTable(num1);
    }

}
