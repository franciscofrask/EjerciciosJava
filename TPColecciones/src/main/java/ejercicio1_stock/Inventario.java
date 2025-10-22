package ejercicio1_stock;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Inventario {
    private ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) { productos.add(p); }

    public void listarProductos() { for (Producto p : productos) p.mostrarInfo(); }

    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) if (p.getId().equalsIgnoreCase(id)) return p;
        return null;
    }

    public boolean eliminarProducto(String id) {
        return productos.removeIf(p -> p.getId().equalsIgnoreCase(id));
    }

    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p == null) return false;
        p.setCantidad(nuevaCantidad);
        return true;
    }

    public List<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> out = new ArrayList<>();
        for (Producto p : productos) if (p.getCategoria() == categoria) out.add(p);
        return out;
    }

    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) total += p.getCantidad();
        return total;
    }

    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) return null;
        return productos.stream().max(Comparator.comparingInt(Producto::getCantidad)).orElse(null);
    }

    public List<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> out = new ArrayList<>();
        for (Producto p : productos) if (p.getPrecio() >= min && p.getPrecio() <= max) out.add(p);
        return out;
    }

    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto c : CategoriaProducto.values())
            System.out.println(c + " - " + c.getDescripcion());
    }
}