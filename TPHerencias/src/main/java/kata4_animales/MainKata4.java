package main.java.kata4_animales;

import java.util.ArrayList;

public class MainKata4 {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Toby"));
        animales.add(new Gato("Luna"));
        animales.add(new Vaca("Margarita"));

        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido(); // polimorfismo vía @Override
        }
    }
}