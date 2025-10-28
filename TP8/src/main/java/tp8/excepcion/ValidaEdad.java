package main.java.tp8.excepcion;

import java.util.Scanner;

public class ValidaEdad {
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) throw new EdadInvalidaException("Edad fuera de rango (0..120)");
    }
    
    // Método con nombre alternativo para compatibilidad
    public static void validar(int edad) throws EdadInvalidaException {
        validarEdad(edad);
    }
    
    public static void ejemploValidacion() {
        System.out.println("Ejemplos de validación de edad:");
        
        int[] edades = {25, -5, 150, 0, 120, 18, 65};
        
        for (int edad : edades) {
            System.out.println("\nValidando edad: " + edad);
            try {
                validarEdad(edad);
                System.out.println("  ✓ Edad válida: " + edad + " años");
                
                // Clasificar edad
                if (edad < 13) {
                    System.out.println("  Categoría: Niño/a");
                } else if (edad < 18) {
                    System.out.println("  Categoría: Adolescente");
                } else if (edad < 65) {
                    System.out.println("  Categoría: Adulto/a");
                } else {
                    System.out.println("  Categoría: Adulto/a mayor");
                }
                
            } catch (EdadInvalidaException ex) {
                System.out.println("  ✗ Error: " + ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        ejemploValidacion();
        System.out.println("\n" + "=".repeat(30));
        validacionInteractiva();
    }
    
    public static void validacionInteractiva() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese edad para validación interactiva: ");
            int e = sc.nextInt();
            try {
                validarEdad(e);
                System.out.println("Edad válida: " + e + " años");
            } catch (EdadInvalidaException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }
}