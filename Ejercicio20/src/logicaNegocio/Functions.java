// Desarrollado por Victor Manuel Morales Hoyos - vmmorales@unicauca.edu.co
// Taller 1 Ejercicio 20
package logicaNegocio;
import java.util.Scanner;

public class Functions {
    // Instanciamiento de Objetos
    Scanner sc = new Scanner(System.in);
    // Declaracion de Variables
    String str;
    public void getData() {
        System.out.println("Ejercicio 20\nIngrese una cadena...");
        str = validateData();
    }
    public String validateData() {
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
    // Operaciones
    public String reverse(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Intercambiar los caracteres en las posiciones left y right
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Mover los índices hacia el centro
            left++;
            right--;
        }
        return new String(charArray);
    }

    public void runOperations() {
        String reversedString = reverse(str);
        System.out.println("La cadena invertida es: "+reversedString);
    }
}
