package ejercicio2_biblioteca;

public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }

    public void mostrarInfo() {
        System.out.println("Autor{id='" + id + "', nombre='" + nombre +
                "', nacionalidad='" + nacionalidad + "'}");
    }

    @Override
    public String toString() {
        return nombre + " (" + nacionalidad + ")";
    }
}