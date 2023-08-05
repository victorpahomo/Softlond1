// Desarrollado por Victor Manuel Morales Hoyos - vmmorales@unicauca.edu.co
// Taller 1 Ejercicio 13
package logicaNegocio;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Functions {
    // Instanciamiento de Objetos
    Scanner sc = new Scanner(System.in);
    // Declaracion de Variables
    double num;
    int decimals;

    public void getData() {
        System.out.println("Ejercicio 13");
        System.out.println("Ingresa un numero decimal");
        num = validateDoubleData();

        do {
            System.out.println("Ingrese el numero de decimales que desea redondear...");
            decimals = validateIntData();
            if (decimals < 0) {
                System.out.println("El numero tiene que ser positivo");
            }
        } while (decimals < 0 || decimals > getNumDecimals(num));
    }

    public int validateIntData() {
        int inputNum;
        while (true) {
            try {
                inputNum = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese numero entero válido:");
                sc.nextLine(); // Limpiar el buffer del scanner
            }
        }
        return inputNum;
    }
    public double validateDoubleData() {
        double inputNum;
        while (true) {
            try {
                inputNum = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese numero decimal válido:");
                sc.nextLine(); // Limpiar el buffer del scanner
            }
        }
        return inputNum;
    }

    // Operaciones
    public double roundDecimal(double num, int decimals) {
        double factor = Math.pow(10, decimals);
        return Math.round(num * factor) / factor;
    }

    private int getNumDecimals(double num) {
        String[] parts = String.valueOf(num).split("\\.");
        return parts.length > 1 ? parts[1].length() : 0;
    }

    public void runOperations() {
        double roundedDecimal = roundDecimal(num, decimals);
        System.out.println("El numero decimal: " + num + " redondeado a " + decimals + " decimales es: \n" + roundedDecimal);
        sc.close();
    }
}
