package tp3POO;
public class NaveEspacial {
    private String nombre;
    private int combustible;
    private final int LIMITE_COMBUSTIBLE = 100;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado.");
        } else {
            System.out.println("❌ No hay suficiente combustible para despegar.");
        }
    }

    public void avanzar(int distancia) {
        int consumo = distancia / 2;
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzó " + distancia + " km. Combustible restante: " + combustible);
        } else {
            System.out.println("❌ Combustible insuficiente para avanzar.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= LIMITE_COMBUSTIBLE) {
            combustible += cantidad;
            System.out.println("🔋 Combustible recargado: " + combustible);
        } else {
            System.out.println("⚠️ No se puede exceder el límite de " + LIMITE_COMBUSTIBLE + " unidades.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible);
    }

    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial("Explorer", 50);
        nave.mostrarEstado();
        nave.avanzar(30);
        nave.recargarCombustible(40);
        nave.despegar();
        nave.avanzar(60);
        nave.mostrarEstado();
    }
}
