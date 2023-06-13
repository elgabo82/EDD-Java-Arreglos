package arreglosed2023s1;

/**
 * Estructuras de Datos - Arreglos Ordenados
 * 2023-S1 31.05.2023 8.23
 * @author Gabriel Eduardo Morejón López
 */
public class ArregloOrdenado {
    public int [] arreglo;
    private int nroElementos;
    
    public ArregloOrdenado(int tam) { // Constructor de la clase
        arreglo = new int[tam]; // Inicializa el arreglo con el tamaño dado.
        nroElementos = 0;
    }
    
    // Método de inserción
    public void insertar(int dato ) {
        int j, k;
        for (j=0; j<nroElementos; j++) {
            if (arreglo[j]>dato) {
                break; // Si el elemento en la posición actual es mayor se detiene
            }
        }
        // Desplazamiento de las posiciones hacia atrás
        for (k=nroElementos; k>j; k--) {
            arreglo[k] = arreglo[k-1];
        }
        
        arreglo[j] = dato; // Se inserta el elemento
        nroElementos++;
    }
    
    // Método para mostrar los elementos
    public void mostrarElementos() {
        int i;
        for (i=0; i<nroElementos; i++){
            System.out.println("[" + i + "] - Elemento: " + arreglo[i] + " ");
        }
    }
    
    // Búsqueda Binaria
    public int busquedaBinaria(int elemento) {
        int limInf = 0;
        int limSup = nroElementos - 1;
        int medio;
        
        while (limInf <= limSup) {
            medio = ((limInf + limSup) / 2); // Calcula el punto medio del arreglo
            if (arreglo[medio]==elemento) {
                return medio; //Devuelve la posición estando en el centro
            } else {
                if (elemento > arreglo[medio]) {
                    limInf = medio + 1; // Si está en la mitad superior o a la derecha
                } else {
                    limSup = medio -1; // Si está en la mitad inferior o a la izquierda
                }
            }
        }
        return -1; // En caso de no encontrar devuelve -1
    }
    
    // Devuelve el elemento de la posición dada
    public int valorElemento(int posicion) {
        return arreglo[posicion];
    }
    
    // Método de eliminación
    public boolean eliminarElemento(int dato) {
        int j = busquedaBinaria(dato);
        if (j == -1) {
            return false; // No se ha encontrado
        } else {
            for (int k=j; k<nroElementos; k++) { // Se desplaza a la derecha
                arreglo[j] = arreglo[j+1]; // Se desplazan los elementos arriba
            }
            nroElementos--; // Se disminuye la cantidad de elementos
        }
        return true;
    }
}
