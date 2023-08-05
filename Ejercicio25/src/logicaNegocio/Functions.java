// Desarrollado por Victor Manuel Morales Hoyos - vmmorales@unicauca.edu.co
// Taller 1 Ejercicio 25
package logicaNegocio;
import java.util.Scanner;

public class Functions {
    // Instanciamiento de Objetos
    Scanner sc = new Scanner(System.in);
    // Declaracion de Variables
    String str;

    public void getData() {
        System.out.println("Ejercicio 25\nIngrese una frase...");
        str = validateStringData();
    }

    public String validateStringData() {
        String userStr;
        while (true) {
            userStr = sc.nextLine();
            // Utilizamos la expresión regular "^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$" para verificar que la frase solo contenga letras y espacios
            if (userStr.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$")) {
                break;
            } else {
                System.out.println("Por favor, ingrese una frase válida (solo letras y espacios): ");
            }
        }
        return userStr;
    }
    // Operaciones
    public String[] separateWords(String str) {
        // Dividir la frase en palabras utilizando los espacios
        return str.split("\\s+");
    }

public void runOperations() {
        String[] separatedWords = separateWords(str);
        for (String separatedWord : separatedWords) {
            System.out.println(separatedWord + " ");
        }
    }
}

