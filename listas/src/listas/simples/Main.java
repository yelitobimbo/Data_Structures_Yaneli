package listas.simples;

/**
 * @author Yaneli Sanchez Cardenas
 * @date 15 Octubre 2026
 */
public class Main {
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();

        System.out.println("Insertando elementos al inicio:");
        lista.insertarAlInicio(30);
        lista.insertarAlInicio(20);
        lista.insertarAlInicio(10);

        // Recorrer y mostrar la lista
        lista.recorrer();
    }
}