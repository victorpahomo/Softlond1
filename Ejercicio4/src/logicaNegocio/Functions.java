// Desarrollado por Victor Manuel Morales Hoyos - vmmorales@unicauca.edu.co
// Taller 1 Ejercicio 4
package logicaNegocio;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Functions {
    // Instanciamiento de Objetos
    Scanner sc = new Scanner(System.in);
    // Declaracion de Variables
    int age;
    public void getData() {
        // Validamos topes de edad
        do {
            System.out.println("Ejercicio 4\nIngrese la edad...");
            age = validateData();
            if (age <=0 || age>110) {
                System.out.println("Edad no válida. Ingrese nuevamente");
            }
        } while (age <= 0 || age > 110);
    }

    public int validateData() {
        int num;
        while (true) {
            try {
                num = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese una edad válida:");
                sc.nextLine(); // Limpiar el buffer del scanner
            }
        }
        return num;
    }
// Operaciones
    public boolean validateAgeRange(int age){
        //Si es mayor de edad retorna true´ sino ´false´
        return age > 17;
    }

    public void runOperations() {
        boolean rangeResult = validateAgeRange(age);
        if (rangeResult) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }

}
