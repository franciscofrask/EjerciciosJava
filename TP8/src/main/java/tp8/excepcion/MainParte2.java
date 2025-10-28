package main.java.tp8.excepcion;

public class MainParte2 {

    public static void main(String[] args) {
        System.out.println("=== EJEMPLOS DE MANEJO DE EXCEPCIONES ===\n");
        
        // Ejemplo 1: División Segura - ArithmeticException
        System.out.println("1. DIVISIÓN SEGURA - ArithmeticException");
        System.out.println("========================================");
        DivisionSegura.ejemploDivision();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Ejemplo 2: Conversión de Cadena - NumberFormatException
        System.out.println("2. CONVERSIÓN DE CADENA - NumberFormatException");
        System.out.println("==============================================");
        CadenaANumero.ejemploConversion();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Ejemplo 3: Validación de Edad - Excepción Personalizada
        System.out.println("3. VALIDACIÓN DE EDAD - Excepción Personalizada");
        System.out.println("===============================================");
        
        // Probamos diferentes edades para mostrar casos válidos e inválidos
        int[] edadesPrueba = {25, -5, 150, 18, 0, 120};
        
        for (int edad : edadesPrueba) {
            System.out.println("\nValidando edad: " + edad);
            try {
                ValidaEdad.validarEdad(edad);
                System.out.println("✓ Edad válida: " + edad + " años");
            } catch (EdadInvalidaException e) {
                System.out.println("✗ Error: " + e.getMessage());
            }
        }
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Ejemplo 4: Lectura de Archivo - IOException/FileNotFoundException
        System.out.println("4. LECTURA DE ARCHIVO - IOException");
        System.out.println("==================================");
        LecturaArchivo.ejemploLectura();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Ejemplo 5: Try-with-resources - Manejo automático de recursos
        System.out.println("5. TRY-WITH-RESOURCES - Manejo automático de recursos");
        System.out.println("====================================================");
        TryWithResourcesLectura.ejemploTryWithResources();
        
        System.out.println("\n" + "=".repeat(50));
        System.out.println("TODOS LOS EJEMPLOS DE EXCEPCIONES COMPLETADOS");
        System.out.println("=".repeat(50));
    }
}