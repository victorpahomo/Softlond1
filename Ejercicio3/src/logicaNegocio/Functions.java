// Desarrollado por Victor Manuel Morales Hoyos - vmmorales@unicauca.edu.co
// Taller 1 Ejercicio 3
package logicaNegocio;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Functions {
    // Instanciamiento de Objetos
    Scanner sc = new Scanner(System.in);
    // Declaracion de Variables
    double radius;
    public void getData() {
        System.out.println("Ejercicio 3\nIngrese el radio del circulo...");
        radius = validateData();
    }
    public double validateData() {
        double num;
        while (true) {
            try {
                num = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número válido:");
                sc.nextLine(); // Limpiar el buffer del scanner
            }
        }
        return num;
    }
// Operaciones
    public double calculateArea(double radius){
        return Math.PI * Math.pow(radius,2);
    }
    public double calculatePerimeter(double radius){
        return 2 * Math.PI * radius;
    }


    public void runOperations(){
        double area = calculateArea(radius);
        double perimeter = calculatePerimeter(radius);
        // Para mostrar solo dos decimales
        String formattedArea = String.format("%.2f", area);
        String formattedPerimeter = String.format("%.2f", perimeter);

        System.out.println("El area del circulo es: "+formattedArea+"\n" +
                "El perimetro del circulo es: "+formattedPerimeter);
    }

}
