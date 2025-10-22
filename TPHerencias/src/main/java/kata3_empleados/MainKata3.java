package main.java.kata3_empleados;

import java.util.ArrayList;

public class MainKata3 {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("P-001", "Ana", 800000, 0.15));
        empleados.add(new EmpleadoTemporal("T-010", "Luis", 120, 2500));
        empleados.add(new EmpleadoPlanta("P-002", "Marcos", 650000, 0.05));
        empleados.add(new EmpleadoTemporal("T-011", "Sofía", 160, 2000));

        System.out.println("Listado y sueldos (polimórfico):");
        for (Empleado e : empleados) {
            System.out.println(e);
        }

        int cantPlanta = 0, cantTemporal = 0;
        for (Empleado e : empleados) {
            if (e instanceof EmpleadoPlanta) cantPlanta++;
            else if (e instanceof EmpleadoTemporal) cantTemporal++;
        }
        System.out.println("\nClasificación con instanceof:");
        System.out.println("Planta: " + cantPlanta + " | Temporales: " + cantTemporal);
    }
}