// Desarrollado por Victor Manuel Morales Hoyos - vmmorales@unicauca.edu.co
// Taller 1 Ejercicio 35 :)
package logicaNegocio;

public class Functions {
    // Declaracion de Variables
    int[][] tablas = new int[10][10];
    // Operaciones
    // Llenar la matriz con las tablas
    public void fillTables(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablas[i][j] = (i + 1) * (j + 1);
            }
        }
    }
    public void runOperations() {
        System.out.println("Ejercicio 35 :)");
        fillTables();
        // Imprimir las tablas
        for (int i = 0; i < 10; i += 5) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 5; k++) {
                    int multiplicador = i + k + 1;
                    System.out.print(multiplicador + " x " + (j + 1) + " = " + tablas[i + k][j] + "\t");
                }
                System.out.println(); // Salto de línea entre filas
            }
            System.out.println(); // Salto de línea entre bloques de tablas
        }

    }
}

