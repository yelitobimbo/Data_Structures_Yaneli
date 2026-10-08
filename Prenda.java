public class Prenda {
    private String tipo;
    private String color;

    public Prenda(String tipo, String color) {
        this.tipo = tipo;
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return tipo + " (" + color + ")";
    }
}