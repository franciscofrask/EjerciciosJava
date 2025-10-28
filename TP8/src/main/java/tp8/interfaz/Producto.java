package main.java.tp8.interfaz;

public class Producto implements Pagable {
    private final String nombre;
    private final double precio;

    public Producto(String nombre, double precio) {
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("Nombre vacío");
        if (precio < 0) throw new IllegalArgumentException("Precio negativo");
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }

    @Override
    public double calcularTotal() { return precio; }

    @Override
    public String toString() { return nombre + " ($" + precio + ")"; }
}