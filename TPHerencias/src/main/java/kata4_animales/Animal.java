package main.java.kata4_animales;

public class Animal {
    private String nombre;

    public Animal(String nombre) { this.nombre = nombre; }

    public String getNombre() { return nombre; }

    public void hacerSonido() {
        System.out.println(nombre + ": (sonido genérico)");
    }

    public void describirAnimal() {
        System.out.println("Animal: " + nombre);
    }
}