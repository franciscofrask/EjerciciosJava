package TP5RelacionesUML.Ejercicio3_Libro_Autor_Editorial;

public class TestEjercicio3 {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 3: Libro - Autor - Editorial ===");

        Autor autor = new Autor("Jorge Luis Borges", "Argentina");
        Editorial editorial = new Editorial("Sudamericana", "Av. Siempre Viva 123");
        Libro libro = new Libro("El Aleph", "ISBN-0001", autor);
        libro.setEditorial(editorial); // agregación

        System.out.println(libro);
    }
}
