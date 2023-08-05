// Desarrollado por Victor Manuel Morales Hoyos - vmmorales@unicauca.edu.co
// Taller 1 Ejercicio 26
package logicaNegocio;
import java.util.Scanner;

public class Functions {
    // Instanciamiento de Objetos
    Scanner sc = new Scanner(System.in);
    // Declaracion de Variables
    String str;

    public void getData() {
        System.out.println("Ejercicio 26\nIngrese una cadena...");
        str = validateStringData();
    }

    public String validateStringData() {
        String userStr;
        while (true) {
            userStr = sc.nextLine();
            // Utilizamos la expresión regular "^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+$" para verificar que la frase solo contenga letras y espacios
            if (userStr.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+$")) {
                break;
            } else {
                System.out.println("Por favor, ingrese una cadena válida (solo letras): ");
            }
        }
        return userStr;
    }

    // Operaciones
    public int countCharacters(String str) {
        // Contar la cantidad de caracteres restantes
        return str.length();
    }

    public void runOperations() {
        int numberWords = countCharacters(str);
        System.out.println("El numero de letras de la cadena es: " + numberWords);
    }
}
