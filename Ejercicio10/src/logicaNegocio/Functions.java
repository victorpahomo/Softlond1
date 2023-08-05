// Desarrollado por Victor Manuel Morales Hoyos - vmmorales@unicauca.edu.co
// Taller 1 Ejercicio 10
package logicaNegocio;

public class Functions {
    // Instanciamiento de Objetos


// Operaciones
    // FUNCION RECURSIVA NUEVAMENTE:)
    public int fibonacci(int num) {
        if (num <= 1 ){
            return num;
        }else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
    public void runOperations() {
        int maxNumber = 20; // Se puede cambiar este numero si se quieren mas ejecuciones
        for (int i = 0; i < maxNumber; i++){
            System.out.println(fibonacci(i)+" ");
        }
    }
}
