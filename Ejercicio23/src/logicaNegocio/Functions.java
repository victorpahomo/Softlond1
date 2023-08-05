// Desarrollado por Victor Manuel Morales Hoyos - vmmorales@unicauca.edu.co
// Taller 1 Ejercicio 23
package logicaNegocio;
import java.util.Scanner;

public class Functions {
    // Instanciamiento de Objetos
    Scanner sc = new Scanner(System.in);
    // Declaracion de Variables
    String str;

    public void getData() {
        System.out.println("Ejercicio 23\nIngrese una frase...");
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
    public int countWords(String str) {
        // Eliminar espacios en blanco al inicio y final de la oración
        str = str.trim();
        // Dividir la oración en palabras utilizando espacios como delimitador
        String[] words = str.split("\\s+");
        // Contar la cantidad de palabras
        return words.length;
    }
    public void runOperations() {
        int numOfWords = countWords(str);
        System.out.println("El numero de palabras en la frase: "+str+" es: "+numOfWords);
    }
}

