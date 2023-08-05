// Desarrollado por Victor Manuel Morales Hoyos - vmmorales@unicauca.edu.co
// Taller 1 Ejercicio 12
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
            System.out.println("Ejercicio 12\nIngrese un numero entero positivo...");
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
    public boolean isPrime(int num1) {
        for (int i = 2; i <= Math.sqrt(num1); i++) {
            if (num1 % i == 0) {
                return false;
            }
        }
        return true;
    }
    public void runOperations() {
        boolean primeResult = isPrime(num1);
        if (primeResult){
            System.out.println("El numero: "+num1+" es PRIMO");
        }else {
            System.out.println("El numero: "+num1+" NO es PRIMO");
        }
    }
}
