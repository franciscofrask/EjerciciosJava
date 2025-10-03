package tp3POO;
public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }

    public void subirCalificacion(double puntos) {
        calificacion += puntos;
    }

    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
    }

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Juan", "Pérez", "Programación II", 7.5);
        e1.mostrarInfo();
        e1.subirCalificacion(1);
        e1.bajarCalificacion(0.5);
        System.out.println("\nDespués de los cambios:");
        e1.mostrarInfo();
    }
}
