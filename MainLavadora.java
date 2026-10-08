public class MainLavadora {
    public static void main(String[] args) {
        ILavadora<Prenda> miLavadora = new Lavadora<>(3);

        System.out.println("=== PRUEBA DEL TDA LAVADORA ===");
        miLavadora.agregarPrenda(new Prenda("Camisa", "Azul"));
        miLavadora.agregarPrenda(new Prenda("Pantalón", "Negro"));
        miLavadora.agregarPrenda(new Prenda("Sudadera", "Gris"));
        
        // Intento de agregar prenda cuando está llena
        miLavadora.agregarPrenda(new Prenda("Calcetines", "Blanco"));

        // Proceso de lavado
        miLavadora.iniciarLavado();

        // Vaciar lavadora
        miLavadora.vaciarLavadora();
    }
}