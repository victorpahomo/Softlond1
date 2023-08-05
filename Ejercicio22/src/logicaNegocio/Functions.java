// Desarrollado por Victor Manuel Morales Hoyos - vmmorales@unicauca.edu.co
// Taller 1 Ejercicio 22
package logicaNegocio;
import java.util.Scanner;

public class Functions {
    // Instanciamiento de Objetos
    Scanner sc = new Scanner(System.in);
    // Declaracion de Variables
    String str;

    public void getData() {
        System.out.println("Ejercicio 22\nIngrese una frase...");
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
    public boolean isPalindrome(String str) {
        // Remiviendo espacios y todo a minuscula con expresion regular y funcion
        str = str.replaceAll("\\s", "").toLowerCase();
        int length = str.length();

        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
    public void runOperations() {
        boolean palindromeCheck = isPalindrome(str);
        if (palindromeCheck){
            System.out.println("La frase: "+str+" SI es PALINDROMO");
        }else {
            System.out.println("La frase: "+str+" NO es PALINDROMO");
        }
    }
}

