package TP5RelacionesUML.Ejercicio6_Reserva_Cliente_Mesa;

public class TestEjercicio6 {
    public static void main(String[] args) {
        Cliente c = new Cliente("Ana","3411223344");
        Reserva r = new Reserva("2025-10-05","21:00", c);
        Mesa m = new Mesa(7,4);
        r.setMesa(m);
        System.out.println(r);
    }
}
