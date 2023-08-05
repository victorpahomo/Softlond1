// Desarrollado por Victor Manuel Morales Hoyos - vmmorales@unicauca.edu.co
// Taller 1 Ejercicio 21
package logicaNegocio;
import java.util.Scanner;

public class Functions {
    // Instanciamiento de Objetos
    Scanner sc = new Scanner(System.in);
    // Declaracion de Variables
    String str;
    char letter;

    public void getData() {
        System.out.println("Ejercicio 21\nIngrese una cadena...");
        str = validateStringData();
        System.out.println("Ingrese una letra a contar");
        letter = validateCharData();
    }

    public String validateStringData() {
        String userStr;
        while (true) {
            userStr = sc.nextLine();
            // Utilizamos la expresión regular "^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+$" para verificar que el nombre solo contenga letras
            if (userStr.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+$")) {
                break;
            } else {
                System.out.println("Por favor, ingrese una cadena válida (solo letras): ");
            }
        }
        return userStr;
    }

    public char validateCharData() {
        char userChar;
        while (true) {
            userChar = sc.next().charAt(0); // Leer solo el primer carácter
            // Utilizamos la expresión regular "^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+$" para verificar que el nombre solo contenga letras
            if (Character.isLetter(userChar)) { // Verificar si es una letra
                break;
            } else {
                System.out.println("Por favor, ingrese una letra válida (solo letras): ");
            }
        }
        return userChar;
    }
    // Operaciones
    public int countLetter(String str, char letter) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(letter)) {
                count++;
            }
        }
        return count;
    }
    public void runOperations() {
        int letterCounter = countLetter(str, letter);
        System.out.println("La letra "+ letter +" aparece "+ letterCounter +" veces en la cadena "+ str);
    }
}

