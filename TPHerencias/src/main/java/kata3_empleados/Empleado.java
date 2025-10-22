package main.java.kata3_empleados;

public abstract class Empleado {
    private String legajo;
    private String nombre;

    public Empleado(String legajo, String nombre) {
        this.legajo = legajo;
        this.nombre = nombre;
    }

    public String getLegajo() { return legajo; }
    public String getNombre() { return nombre; }

    public abstract double calcularSueldo();

    @Override
    public String toString() {
        return "[" + legajo + "] " + nombre + " → sueldo=" + calcularSueldo();
    }
}