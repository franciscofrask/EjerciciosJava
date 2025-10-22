package ejercicio1_stock;

public class MainStock {
    public static void main(String[] args) {
        Inventario inv = new Inventario();

        inv.agregarProducto(new Producto("P001","Leche",1200,30, CategoriaProducto.ALIMENTOS));
        inv.agregarProducto(new Producto("P002","Televisor",250000,5, CategoriaProducto.ELECTRONICA));
        inv.agregarProducto(new Producto("P003","Remera",3500,40, CategoriaProducto.ROPA));
        inv.agregarProducto(new Producto("P004","Silla",15000,12, CategoriaProducto.HOGAR));
        inv.agregarProducto(new Producto("P005","Yerba",2600,22, CategoriaProducto.ALIMENTOS));

        System.out.println("Listado de productos:");
        inv.listarProductos();

        System.out.println("\nBuscar P003:");
        Producto buscado = inv.buscarProductoPorId("P003");
        if (buscado != null) buscado.mostrarInfo();

        System.out.println("\nFiltrar ALIMENTOS:");
        inv.filtrarPorCategoria(CategoriaProducto.ALIMENTOS).forEach(Producto::mostrarInfo);

        System.out.println("\nEliminar P002:");
        inv.eliminarProducto("P002");
        inv.listarProductos();

        System.out.println("\nActualizar stock P001 a 50:");
        inv.actualizarStock("P001", 50);
        inv.buscarProductoPorId("P001").mostrarInfo();

        System.out.println("\nTotal stock: " + inv.obtenerTotalStock());
        System.out.println("Producto con mayor stock: " + inv.obtenerProductoConMayorStock());

        System.out.println("\nPrecio entre 1000 y 3000:");
        inv.filtrarProductosPorPrecio(1000, 3000).forEach(Producto::mostrarInfo);

        System.out.println("\nCategorias disponibles:");
        inv.mostrarCategoriasDisponibles();
    }
}