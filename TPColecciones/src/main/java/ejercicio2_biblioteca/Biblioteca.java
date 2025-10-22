package ejercicio2_biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre) { this.nombre = nombre; }

    public String getNombre() { return nombre; }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }

    public void listarLibros() { for (Libro l : libros) l.mostrarInfo(); }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) if (l.getIsbn().equalsIgnoreCase(isbn)) return l;
        return null;
    }

    public boolean eliminarLibro(String isbn) {
        return libros.removeIf(l -> l.getIsbn().equalsIgnoreCase(isbn));
    }

    public int obtenerCantidadLibros() { return libros.size(); }

    public List<Libro> filtrarLibrosPorAnio(int anio) {
        ArrayList<Libro> out = new ArrayList<>();
        for (Libro l : libros) if (l.getAnioPublicacion() == anio) out.add(l);
        return out;
    }

    public void mostrarAutoresDisponibles() {
        ArrayList<String> set = new ArrayList<>();
        for (Libro l : libros) {
            String repr = l.getAutor().toString();
            if (!set.contains(repr)) set.add(repr);
        }
        for (String a : set) System.out.println(a);
    }
}