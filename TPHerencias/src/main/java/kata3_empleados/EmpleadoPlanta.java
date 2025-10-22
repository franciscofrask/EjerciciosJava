package main.java.kata3_empleados;

public class EmpleadoPlanta extends Empleado {
    private double sueldoBasico;
    private double antiguedadPorc; // ej.: 0.10 = 10%

    public EmpleadoPlanta(String legajo, String nombre, double sueldoBasico, double antiguedadPorc) {
        super(legajo, nombre);
        this.sueldoBasico = sueldoBasico;
        this.antiguedadPorc = antiguedadPorc;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBasico * (1.0 + antiguedadPorc);
    }
}