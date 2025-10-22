package main.java.kata4_animales;

public class Gato extends Animal {
    public Gato(String nombre) { super(nombre); }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + ": Miau!");
    }
}