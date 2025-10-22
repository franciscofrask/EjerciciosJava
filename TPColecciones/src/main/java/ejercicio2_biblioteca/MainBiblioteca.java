package ejercicio2_biblioteca;

public class MainBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblio = new Biblioteca("Sarmiento");

        Autor a1 = new Autor("A1", "Julio Verne", "Francia");
        Autor a2 = new Autor("A2", "J. K. Rowling", "Reino Unido");
        Autor a3 = new Autor("A3", "Jorge L. Borges", "Argentina");

        biblio.agregarLibro("ISBN-001","Viaje al centro de la Tierra",1864,a1);
        biblio.agregarLibro("ISBN-002","La isla misteriosa",1874,a1);
        biblio.agregarLibro("ISBN-003","Harry Potter y la piedra filosofal",1997,a2);
        biblio.agregarLibro("ISBN-004","Ficciones",1944,a3);
        biblio.agregarLibro("ISBN-005","El Aleph",1949,a3);

        System.out.println("Listado:");
        biblio.listarLibros();

        System.out.println("\nBuscar ISBN-003:");
        System.out.println(biblio.buscarLibroPorIsbn("ISBN-003"));

        System.out.println("\nFiltrar año 1944:");
        biblio.filtrarLibrosPorAnio(1944).forEach(System.out::println);

        System.out.println("\nEliminar ISBN-002:");
        biblio.eliminarLibro("ISBN-002");
        biblio.listarLibros();

        System.out.println("\nCantidad total de libros: " + biblio.obtenerCantidadLibros());

        System.out.println("\nAutores disponibles:");
        biblio.mostrarAutoresDisponibles();
    }
}