public class Lavadora<T> implements ILavadora<T> {
    private Object[] tina;
    private int contador;
    private int capacidad;

    public Lavadora(int capacidad) {
        this.capacidad = capacidad;
        this.tina = new Object[capacidad];
        this.contador = 0;
    }

    @Override
    public boolean agregarPrenda(T prenda) {
        if (estaLleno()) {
            System.out.println("La lavadora está llena. No se puede agregar: " + prenda);
            return false;
        }
        tina[contador] = prenda;
        contador++;
        System.out.println("Prenda agregada: " + prenda);
        return true;
    }

    @Override
    public void iniciarLavado() {
        if (estaVacio()) {
            System.out.println("No se puede lavar, la lavadora está vacía.");
            return;
        }
        System.out.println("\n--- Iniciando ciclo de lavado ---");
        for (int i = 0; i < contador; i++) {
            System.out.println("Lavando: " + tina[i]);
        }
        System.out.println("¡Ciclo de lavado completado con éxito!\n");
    }

    @Override
    public void vaciarLavadora() {
        for (int i = 0; i < contador; i++) {
            tina[i] = null;
        }
        contador = 0;
        System.out.println("La lavadora ha sido vaciada.");
    }

    @Override
    public int getCantidadPrendas() {
        return contador;
    }

    @Override
    public boolean estaLleno() {
        return contador == capacidad;
    }

    @Override
    public boolean estaVacio() {
        return contador == 0;
    }
}