package ejercicio3_universidad;

public class MainUniversidad {
    public static void main(String[] args) {
        Universidad u = new Universidad("UNT");

        Profesor p1 = new Profesor("PR1","Ana María","Bases de Datos");
        Profesor p2 = new Profesor("PR2","Carlos López","Programación");
        Profesor p3 = new Profesor("PR3","Beatriz Soto","Redes");

        u.agregarProfesor(p1);
        u.agregarProfesor(p2);
        u.agregarProfesor(p3);

        Curso c1 = new Curso("BD101","Modelado Relacional");
        Curso c2 = new Curso("PR201","POO en Java");
        Curso c3 = new Curso("RD301","Routing y Switching");
        Curso c4 = new Curso("PR202","Estructuras de Datos");
        Curso c5 = new Curso("BD102","SQL Avanzado");

        u.agregarCurso(c1);
        u.agregarCurso(c2);
        u.agregarCurso(c3);
        u.agregarCurso(c4);
        u.agregarCurso(c5);

        u.asignarProfesorACurso("BD101","PR1");
        u.asignarProfesorACurso("BD102","PR1");
        u.asignarProfesorACurso("PR201","PR2");
        u.asignarProfesorACurso("PR202","PR2");
        u.asignarProfesorACurso("RD301","PR3");

        System.out.println("Cursos:");
        u.listarCursos();
        System.out.println("\nProfesores:");
        u.listarProfesores();

        System.out.println("\nReasignar PR201 a PR1:");
        u.asignarProfesorACurso("PR201","PR1");
        u.listarCursos();

        System.out.println("\nEliminar BD102:");
        u.eliminarCurso("BD102");
        u.listarCursos();
        System.out.println("\nCursos de PR1:");
        p1.listarCursos();

        System.out.println("\nEliminar profesor PR2:");
        u.eliminarProfesor("PR2");
        u.listarCursos();

        System.out.println();
        u.reporteCantidadCursosPorProfesor();
    }
}