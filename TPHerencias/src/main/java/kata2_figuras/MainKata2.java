package main.java.kata2_figuras;

public class MainKata2 {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[] {
            new Circulo(3.0),
            new Rectangulo(4.0, 2.5),
            new Circulo(1.5),
            new Rectangulo(10.0, 1.0)
        };

        for (Figura f : figuras) {
            System.out.println(f.getNombre() + " → área: " + f.calcularArea());
        }
    }
}