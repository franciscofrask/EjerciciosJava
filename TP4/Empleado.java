package TP4;

public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    private static int totalEmpleados = 0;
    private static int nextId = 1;
    private static final double SALARIO_POR_DEFECTO = 100000.0;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    public Empleado(String nombre, String puesto) {
        this.id = nextId++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = SALARIO_POR_DEFECTO;
        totalEmpleados++;
    }

    public void actualizarSalario(double porcentaje) {
        double factor = 1 + (porcentaje / 100.0);
        this.salario *= factor;
    }

    public void actualizarSalario(double montoFijo, boolean aplicarComoMontoFijo) {
        if (aplicarComoMontoFijo) {
            this.salario += montoFijo;
        } else {
            actualizarSalario(montoFijo);
        }
    }

    @Override
    public String toString() {
        return "Empleado { id=" + id + ", nombre='" + nombre + "', puesto='" + puesto + "', salario=" + String.format("%.2f", salario) + " }";
    }

    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getPuesto() { return puesto; }
    public void setPuesto(String puesto) { this.puesto = puesto; }
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
}
