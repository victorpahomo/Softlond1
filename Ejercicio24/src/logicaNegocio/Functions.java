// Desarrollado por Victor Manuel Morales Hoyos - vmmorales@unicauca.edu.co
// Taller 1 Ejercicio 24
package logicaNegocio;
import java.util.Scanner;

public class Functions {
    // Instanciamiento de Objetos
    Scanner sc = new Scanner(System.in);
    // Declaracion de Variables
    String str;
    char oldLetter, newLetter;

    public void getData() {
        System.out.println("Ejercicio 24\nIngrese una cadena...");
        str = validateStringData();
        System.out.println("Ingrese la letra la antigua letra que desea reemplazar");
        oldLetter = validateCharData();
        System.out.println("Ingrese la nueva letra que desea que reemplace a la anterior");
        newLetter = validateCharData();
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
    public String replaceLetter(String str, char oldLetter, char newLetter) {
        // Reemplazar todas las apariciones de la letraAntigua por la letraNueva en la cadena
        return str.replace(oldLetter, newLetter);
    }
    public void runOperations() {
        String newStr = replaceLetter(str,oldLetter,newLetter);
        System.out.println("La nueva cadena con reemplazos es: "+newStr);
    }
}

