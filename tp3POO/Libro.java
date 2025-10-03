package tp3POO;
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion);
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnioPublicacion() { return anioPublicacion; }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 0 && anioPublicacion <= 2025) {
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("⚠️ Año inválido: " + anioPublicacion);
        }
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + anioPublicacion);
    }

    public static void main(String[] args) {
        Libro libro = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967);
        libro.mostrarInfo();
        libro.setAnioPublicacion(3000);
        libro.setAnioPublicacion(1985);
        libro.mostrarInfo();
    }
}
