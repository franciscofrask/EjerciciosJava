package TP5RelacionesUML.Ejercicio4_TarjetaCredito_Cliente_Banco;

public class TestEjercicio4 {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 4: TarjetaCredito - Cliente - Banco ===");

        Banco banco = new Banco("Banco Nación", "30-12345678-9");
        Cliente cliente = new Cliente("Lucía Díaz", "40111222");
        TarjetaCredito tarjeta = new TarjetaCredito("4500-1234-5678-9999", "12/28", banco);

        tarjeta.setCliente(cliente); // bidireccional

        System.out.println(tarjeta);
        System.out.println(cliente);
        System.out.println(banco);
    }
}
