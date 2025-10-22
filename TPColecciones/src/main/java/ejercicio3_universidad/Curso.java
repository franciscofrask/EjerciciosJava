package ejercicio3_universidad;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor; // puede ser null

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    public void setProfesor(Profesor p) {
        if (this.profesor == p) return;
        Profesor anterior = this.profesor;
        this.profesor = p;
        if (anterior != null) anterior.getCursos().remove(this);
        if (p != null && !p.getCursos().contains(this)) p.getCursos().add(this);
    }

    public void mostrarInfo() { System.out.println(this); }

    @Override
    public String toString() {
        String prof = (profesor == null) ? "sin profesor" : profesor.getNombre();
        return "Curso{codigo='" + codigo + "', nombre='" + nombre + "', profesor=" + prof + "}";
    }
}