package main.java.tp8.excepcion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

public class TryWithResourcesLectura {
    public static void main(String[] args) {
        ejemploTryWithResources();
    }
    
    public static void ejemploTryWithResources() {
        System.out.println("Ejemplos de Try-with-resources:");
        
        // Ejemplo 1: Lectura de string simulando archivo
        System.out.println("\n1. Lectura con StringReader (simulando archivo):");
        String contenidoSimulado = "Línea 1\nLínea 2\nLínea 3\nÚltima línea";
        
        try (BufferedReader br = new BufferedReader(new StringReader(contenidoSimulado))) {
            System.out.println("✓ Recurso abierto correctamente");
            String linea;
            int numeroLinea = 1;
            while ((linea = br.readLine()) != null) {
                System.out.println("  " + numeroLinea + ": " + linea);
                numeroLinea++;
            }
            System.out.println("✓ Lectura completada");
        } catch (IOException e) {
            System.out.println("✗ Error de I/O: " + e.getMessage());
        }
        // El BufferedReader se cierra automáticamente aquí
        System.out.println("✓ Recurso cerrado automáticamente");
        
        // Ejemplo 2: Intentar leer archivo real
        System.out.println("\n2. Intento de lectura de archivo real:");
        String[] archivos = {"pom.xml", "INSTRUCCIONES.txt", "archivo_inexistente.txt"};
        
        for (String ruta : archivos) {
            System.out.println("\nIntentando leer: " + ruta);
            try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
                System.out.println("✓ Archivo abierto: " + ruta);
                String primeraLinea = br.readLine();
                if (primeraLinea != null) {
                    System.out.println("  Primera línea: " + primeraLinea);
                } else {
                    System.out.println("  Archivo vacío");
                }
            } catch (IOException e) {
                System.out.println("✗ Error: " + e.getMessage());
            }
            // Los recursos se liberan automáticamente
        }
        
        // Ejemplo 3: Múltiples recursos en el mismo try
        System.out.println("\n3. Múltiples recursos en el mismo try:");
        String datos1 = "Archivo 1\nContenido del primer archivo";
        String datos2 = "Archivo 2\nContenido del segundo archivo";
        
        try (BufferedReader br1 = new BufferedReader(new StringReader(datos1));
             BufferedReader br2 = new BufferedReader(new StringReader(datos2))) {
            
            System.out.println("✓ Ambos recursos abiertos");
            System.out.println("Primer archivo: " + br1.readLine());
            System.out.println("Segundo archivo: " + br2.readLine());
            
        } catch (IOException e) {
            System.out.println("✗ Error: " + e.getMessage());
        }
        System.out.println("✓ Todos los recursos cerrados automáticamente");
    }
}