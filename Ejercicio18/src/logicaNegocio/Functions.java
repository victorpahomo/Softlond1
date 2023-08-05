// Desarrollado por Victor Manuel Morales Hoyos - vmmorales@unicauca.edu.co
// Taller 1 Ejercicio 18
package logicaNegocio;
import java.util.Random;
public class Functions {
    // Operaciones
    public String passwordGenerator() {
        String characters = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz0123456789";
        int passLength = 8;
        Random random = new Random();
        String generatedPass = "";

        for (int i = 0; i < passLength; i++) {
            int randomIndex = random.nextInt(characters.length());
            char randomCharacter = characters.charAt(randomIndex);
            generatedPass += randomCharacter;
        }
        return generatedPass;
    }
    public void runOperations() {
        String passwordGenerated = passwordGenerator();
        System.out.println("La contraseña aleatoria generada es: "+passwordGenerated);
    }
}
