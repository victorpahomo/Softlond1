// Desarrollado por Victor Manuel Morales Hoyos - vmmorales@unicauca.edu.co
// Taller 1 Ejercicio 30
package logicaNegocio;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Functions {
    // Declaracion de Variables
    int[] array = {1, 2, 3, 2, 4, 5, 1, 6, 7, 8, 5 };

    // Operaciones
    // Algoritmo de con estructura LinkedHash, lo que combina una lista enlazada y una tabla hash en Java
    public int[] removeDuplicates(int[] array) {
        // Convierte el aaray en LinkedHashSet para remover los duplicados y mantener el orden
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : array) {
            set.add(num);
        }
        // Se crea array con los elementos unicos
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        return result;
    }



public void runOperations() {
        System.out.println("Ejercicio 30");
        int[] result = removeDuplicates(array);
        System.out.println("Array original: "+ Arrays.toString(array));
        System.out.println("Array sin duplicados: "+Arrays.toString(result));
    }
}

