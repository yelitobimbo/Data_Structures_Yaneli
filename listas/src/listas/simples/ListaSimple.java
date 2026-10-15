package listas.simples;

/**
 + Definicion de una lista simple
 * @author Yaneli Sanchez Cardenas
 * @date 15 Octubre 2026
 */
public class ListaSimple {
    private Nodo cabeza;

    public ListaSimple() {
        this.cabeza = null;
    }

    // Método para insertar al inicio (Complejidad O(1))
    public void insertarAlInicio(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        nuevoNodo.setSig(cabeza);
        cabeza = nuevoNodo;
    }

    // Método para recorrer e imprimir los elementos de la lista
    public void recorrer() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print("[" + actual.getValor() + "] -> ");
            actual = actual.getSig();
        }
        System.out.println("null");
    }
}
 
