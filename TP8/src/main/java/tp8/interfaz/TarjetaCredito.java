package main.java.tp8.interfaz;

public class TarjetaCredito implements PagoConDescuento {
    private final String nro;
    private final double porcentajeDescuento; // 0..1 (ej: 0.10 = 10%)

    public TarjetaCredito(String nro, double porcentajeDescuento) {
        if (nro == null || nro.isBlank()) throw new IllegalArgumentException("Nro inválido");
        if (porcentajeDescuento < 0 || porcentajeDescuento > 1) throw new IllegalArgumentException("Descuento fuera de rango");
        this.nro = nro;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * (1 - porcentajeDescuento);
    }

    @Override
    public boolean procesarPago(double monto) {
        // simulado
        System.out.println("Pagado con Tarjeta " + nro + " por $" + String.format("%.2f", monto));
        return true;
    }
}