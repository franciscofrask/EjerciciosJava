package TP4;
public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado e1 = new Empleado(100, "Ana Gómez", "Analista", 800000.0);
        Empleado e2 = new Empleado("Luis Pérez", "Desarrollador");
        Empleado e3 = new Empleado("Carla Ruiz", "QA");

        e1.actualizarSalario(10);
        e2.actualizarSalario(50000.0, true);
        e3.actualizarSalario(-5);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}
