// Desarrollado por Victor Manuel Morales Hoyos - vmmorales@unicauca.edu.co
// Taller 1 Ejercicio 1
package logicaNegocio;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Functions {
    // Instanciamiento de Objetos
    Scanner sc = new Scanner(System.in);
    // Declaracion de Variables
    int num1,num2;
    public void getData() {
        System.out.println("Ejercicio 1\nIngrese el primer numero...");
        num1 = validateData();
        System.out.println("Ingrese el segundo numero...");
        num2 = validateData();
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
public int add(int num1, int num2) {
        return num1 + num2;
    }
    public int subtract(int num1,int num2){
        return num1 - num2;
    }
    public int multiply(int num1,int num2){
        return num1 * num2;
    }
    public static int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("No es posible dividir entre 0.");
        }
        return num1 / num2;
    }

    public void runOperations(){
        int sum = add(num1,num2);
        int difference = subtract(num1,num2);
        int product = multiply(num1,num2);
        int quotient = divide(num1,num2);

        System.out.println("El resultado de la suma es: "+sum+"\n" +
                "El resultado de la resta: "+difference+"\n"+
                "El resultado de la multiplicacion: "+product+"\n"+
                "El resultado de la division entera: "+quotient);
    }

}
