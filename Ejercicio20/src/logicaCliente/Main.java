// Desarrollado por Victor Manuel Morales Hoyos - vmmorales@unicauca.edu.co
// Taller 1 Ejercicio 20
package logicaCliente;
import logicaNegocio.Functions;
// Programa que solicite al usuario dos números enteros y muestre
// su suma, resta, multiplicación y división.
public class Main {
    public static void main(String[] args) {
        // Instanciamiento de Objetos
        Functions functions = new Functions();
        functions.getData(); // Solicitamos la data
        functions.runOperations(); // Eejecutamos las operaciones
    }
}