package main.java.tp8.excepcion;

import java.util.Scanner;

public class CadenaANumero {
    public static void main(String[] args) {
        ejemploConversion();
    }
    
    public static void ejemploConversion() {
        System.out.println("Ejemplos de conversión de cadena a número:");
        
        // Ejemplos predeterminados
        String[] ejemplos = {"123", "45.67", "abc", "12x34", "", "  89  "};
        
        for (String texto : ejemplos) {
            System.out.println("\nIntentando convertir: '" + texto + "'");
            
            // Conversión a entero
            try {
                int entero = Integer.parseInt(texto.trim());
                System.out.println("  Como entero: " + entero);
            } catch (NumberFormatException e) {
                System.out.println("  Error (entero): " + e.getMessage());
            }
            
            // Conversión a decimal
            try {
                double decimal = Double.parseDouble(texto.trim());
                System.out.println("  Como decimal: " + decimal);
            } catch (NumberFormatException e) {
                System.out.println("  Error (decimal): " + e.getMessage());
            }
        }
    }
    
    public static void conversionInteractiva() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese texto: ");
            String s = sc.nextLine();
            try {
                int n = Integer.parseInt(s);
                System.out.println("Entero: " + n);
            } catch (NumberFormatException e) {
                System.out.println("Error: no es un entero válido.");
            }
        }
    }
}