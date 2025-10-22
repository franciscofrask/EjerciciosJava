package TP5RelacionesUML.Ejercicio1_Pasaporte_Foto_Titular;
public class TestEjercicio1 {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 1: Pasaporte - Foto - Titular ===");

        Titular titular = new Titular("Juan Pérez", "12345678");
        Pasaporte pasaporte = new Pasaporte("ARG123456", "2025-01-01", "juan.jpg", "JPG");

        // Establecer relación bidireccional
        pasaporte.setTitular(titular);

        System.out.println(pasaporte);
        System.out.println(titular);

        // Actualizar foto (composición)
        pasaporte.actualizarFoto("juan_nueva.png", "PNG");
        System.out.println("Foto actualizada: " + pasaporte.getFoto());
    }
}
