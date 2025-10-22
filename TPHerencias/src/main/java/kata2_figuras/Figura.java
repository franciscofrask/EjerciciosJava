package main.java.kata2_figuras;

public abstract class Figura {
    private String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }

    public abstract double calcularArea();

    @Override
    public String toString() {
        return nombre + " (area=" + calcularArea() + ")";
    }
}