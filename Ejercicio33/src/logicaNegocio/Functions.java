// Desarrollado por Victor Manuel Morales Hoyos - vmmorales@unicauca.edu.co
// Taller 1 Ejercicio 33
package logicaNegocio;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Functions {
    // Declaracion de Variables
    int[] array = {10, 5, 8, 15, 20, 12, 18, 10, 5, 20, 5, 12};

    // Operaciones
    // Algoritmo usando Map clave valor
    public Map<Integer, Integer> countElementFrequency(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            int frequency = frequencyMap.getOrDefault(num, 0);
            frequencyMap.put(num, frequency + 1);// Adicionamos clave-valor cada frecuencia
        }
        return frequencyMap;//Retornamos una estructura Map
    }

    public void runOperations() {
        System.out.println("Ejercicio 33");
        System.out.println("Arreglo: "+Arrays.toString(array));
        Map<Integer, Integer> frequencyMap = countElementFrequency(array);

        System.out.println("Frecuencia de cada elemento en el arreglo:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Elemento " + entry.getKey() + ": " + entry.getValue() + " veces.");
        }
    }
}

