package listas.simples;

/**
 * @author Yaneli Sanchez Cardenas
 * @date 15 Octubre 2026
 */
public class Nodo {
    private int valor;
    private Nodo sig;

    // Constructor
    public Nodo(int valor) {
        this.valor = valor;
        this.sig = null;
    }

    // Getters y Setters
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
}