// Desarrollado por Victor Manuel Morales Hoyos - vmmorales@unicauca.edu.co
// Taller 1 Ejercicio 19
package logicaNegocio;
import java.util.Scanner;

public class Functions {
    // Instanciamiento de Objetos
    Scanner sc = new Scanner(System.in);
    // Declaracion de Variables
    String name;
    public void getData() {
        System.out.println("Ejercicio 19\nIngrese un nombre...");
        name = validateData();
    }
    public String validateData() {
        String name;
        while (true) {
            name = sc.nextLine();
            // Utilizamos la expresión regular "^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+$" para verificar que el nombre solo contenga letras
            if (name.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+$")) {
                break;
            } else {
                System.out.println("Por favor, ingrese un nombre válido (solo letras): ");
            }
        }
        return name;
    }

    public void runOperations() {
        String nameInUpperCase = name.toUpperCase();
        String nameInLowerCase = name.toLowerCase();
        System.out.println("El nombre en mayuscula es: "+nameInUpperCase);
        System.out.println("El nombre en mainuscula es: "+nameInLowerCase);
    }
}
