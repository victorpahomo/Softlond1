// Desarrollado por Victor Manuel Morales Hoyos - vmmorales@unicauca.edu.co
// Taller 1 Ejercicio 11
package logicaNegocio;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Functions {
    // Instanciamiento de Objetos
    Scanner sc = new Scanner(System.in);
    // Declaracion de Variables
    double num1,num2,num3;

    public void getData() {
        do {
            if (num1 < 0 || num2 < 0 || num3 < 0 || !isValidTriangle(num1,num2,num3)){
                System.out.println("Introdujiste mal un dato o el triangulo es invalido");
                System.out.println("Ejemplo de un triangulo valido: 5,4,3");
            }
            System.out.println("Ejercicio 11\nIngrese el primer lado...");
            num1 = validateData();
            System.out.println("Ingrese el segundo lado");
            num2 = validateData();
            System.out.println("Ingrese el tercer lado");
            num3 = validateData();
        } while (num1 < 0 || num2 < 0 || num3 < 0 || !isValidTriangle(num1,num2,num3));
    }

    public double validateData() {
        double num;
        while (true) {
            try {
                num = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese numeros enteros válidos:");
                sc.nextLine(); // Limpiar el buffer del scanner
            }
        }
        return num;
    }
    public boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    // Operaciones
    public double heronArea(double num1, double num2, double num3) {
        double s = (num1 + num2 + num3) / 2;
        return Math.sqrt(s * (s - num1) * (s - num2) * (s - num3));
    }

    public void runOperations() {
        double area = heronArea(num1, num2, num3);
        System.out.println("El area del triangulo calculada con la formula de Heron es: " + area);
    }
}
