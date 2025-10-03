package TP5RelacionesUML.Ejercicio2_Celular_Bateria_Usuario;

public class TestEjercicio2 {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 2: Celular - Batería - Usuario ===");

        Bateria bateria = new Bateria("BAT-AX100", 4500);
        Celular celular = new Celular("123456789012345", "Samsung", "S24");
        Usuario usuario = new Usuario("María Lopez", "44555666");

        // Agregación: asignar batería (puede existir sin el celular)
        celular.setBateria(bateria);

        // Asociación bidireccional con usuario
        celular.setUsuario(usuario);

        System.out.println(celular);
        System.out.println(usuario);
        System.out.println("Batería: " + celular.getBateria());
    }
}
