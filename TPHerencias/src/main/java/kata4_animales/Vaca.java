package main.java.kata4_animales;

public class Vaca extends Animal {
    public Vaca(String nombre) { super(nombre); }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + ": Muu!");
    }
}