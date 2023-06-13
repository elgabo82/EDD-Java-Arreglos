package arreglosed2023s1;

/**
 * Estructuras de Datos - 2023-S1 31.05.2023 8.30
 * Implementación de la clase Arreglo Ordenado
 * @author Gabriel Eduardo Morejón López
 */
public class ArreglosED2023S1 {

    public static void main(String[] args) {
        ArregloOrdenado arreglo1 = new ArregloOrdenado(5);        
        System.out.println("Arreglos Ordenados");
        arreglo1.insertar(26);
        arreglo1.insertar(16);
        arreglo1.insertar(88);
        arreglo1.insertar(-5);
        arreglo1.insertar(15);
        arreglo1.mostrarElementos();
        System.out.println(arreglo1.busquedaBinaria(16));
        System.out.println(arreglo1.eliminarElemento(-5));
        arreglo1.mostrarElementos();
        
    }
}
