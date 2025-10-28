package main.java.tp8.excepcion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaArchivo {
    public static void main(String[] args) {
        ejemploLectura();
    }
    
    public static void ejemploLectura() {
        System.out.println("Ejemplos de lectura de archivos:");
        
        // Intentar leer archivos que probablemente existan
        String[] rutasEjemplo = {
            "archivo_inexistente.txt",
            "README-TP8.txt",
            "INSTRUCCIONES.txt",
            "pom.xml"
        };
        
        for (String ruta : rutasEjemplo) {
            System.out.println("\n--- Intentando leer: " + ruta + " ---");
            try (Scanner lector = new Scanner(new File(ruta))) {
                System.out.println("✓ Archivo encontrado");
                int lineas = 0;
                while (lector.hasNextLine() && lineas < 3) {
                    System.out.println("  Línea " + (lineas + 1) + ": " + lector.nextLine());
                    lineas++;
                }
                if (lector.hasNextLine()) {
                    System.out.println("  ... (más líneas disponibles)");
                }
                if (lineas == 0) {
                    System.out.println("  Archivo vacío");
                }
            } catch (FileNotFoundException e) {
                System.out.println("✗ Error: archivo no encontrado - " + e.getMessage());
            } catch (Exception e) {
                System.out.println("✗ Error inesperado: " + e.getMessage());
            }
        }
    }
    
    public static void lecturaInteractiva() {
        System.out.println("Ruta completa del archivo a leer:");
        try (Scanner sc = new Scanner(System.in)) {
            String ruta = sc.nextLine();
            try (Scanner lector = new Scanner(new File(ruta))) {
                if (lector.hasNextLine()) {
                    System.out.println("Primera línea: " + lector.nextLine());
                } else {
                    System.out.println("Archivo vacío.");
                }
            } catch (FileNotFoundException e) {
                System.out.println("Error: archivo no encontrado.");
            }
        }
    }
}