package ejercicio3_universidad;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();

    public Universidad(String nombre) { this.nombre = nombre; }

    public String getNombre() { return nombre; }

    public void agregarProfesor(Profesor p) { profesores.add(p); }
    public void agregarCurso(Curso c) { cursos.add(c); }

    public void listarProfesores() { for (Profesor p : profesores) p.mostrarInfo(); }
    public void listarCursos() { for (Curso c : cursos) c.mostrarInfo(); }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) if (p.getId().equalsIgnoreCase(id)) return p;
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) if (c.getCodigo().equalsIgnoreCase(codigo)) return c;
        return null;
    }

    public boolean eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c == null) return false;
        if (c.getProfesor() != null) {
            c.getProfesor().getCursos().remove(c);
            c.setProfesor(null);
        }
        return cursos.remove(c);
    }

    public boolean eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p == null) return false;
        for (Curso c : new ArrayList<>(p.getCursos())) c.setProfesor(null);
        return profesores.remove(p);
    }

    public boolean asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso c = buscarCursoPorCodigo(codigoCurso);
        Profesor p = buscarProfesorPorId(idProfesor);
        if (c == null || p == null) return false;
        c.setProfesor(p);
        return true;
    }

    public void reporteCantidadCursosPorProfesor() {
        Map<String,Integer> map = new HashMap<>();
        for (Profesor p : profesores) map.put(p.getNombre(), p.getCursos().size());
        System.out.println("Cantidad de cursos por profesor:");
        for (Map.Entry<String,Integer> e : map.entrySet())
            System.out.println(e.getKey() + ": " + e.getValue());
    }
}