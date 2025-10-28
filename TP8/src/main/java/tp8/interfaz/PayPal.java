package main.java.tp8.interfaz;

public class PayPal implements Pago {
    private final String correo;

    public PayPal(String correo) {
        if (correo == null || correo.isBlank()) throw new IllegalArgumentException("Correo inválido");
        this.correo = correo;
    }

    @Override
    public boolean procesarPago(double monto) {
        // simulado
        System.out.println("Pagado con PayPal (" + correo + ") por $" + String.format("%.2f", monto));
        return true;
    }
}