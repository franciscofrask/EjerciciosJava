package main.java.tp8.interfaz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pedido implements Pagable {
    public enum Estado { CREADO, PAGADO, ENVIADO, ENTREGADO }

    private final List<Producto> productos = new ArrayList<>();
    private Estado estado = Estado.CREADO;
    private Notificable cliente; // opcional si querés notificar

    public void setCliente(Notificable cliente) { this.cliente = cliente; }

    public void agregarProducto(Producto p) {
        if (p == null) throw new IllegalArgumentException("Producto null");
        productos.add(p);
    }

    public List<Producto> getProductos() { return Collections.unmodifiableList(productos); }

    public Estado getEstado() { return estado; }

    public void cambiarEstado(Estado nuevo) {
        this.estado = nuevo;
        notificar("Estado del pedido: " + nuevo);
    }

    private void notificar(String msg) {
        if (cliente != null) cliente.notificar(msg);
    }

    @Override
    public double calcularTotal() {
        double total = 0.0;
        for (Producto p : productos) total += p.getPrecio();
        return total;
    }
}