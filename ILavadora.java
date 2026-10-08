public interface ILavadora<T> {
    boolean agregarPrenda(T prenda);
    void iniciarLavado();
    void vaciarLavadora();
    int getCantidadPrendas();
    boolean estaLleno();
    boolean estaVacio();
}