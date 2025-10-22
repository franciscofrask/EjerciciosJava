package TP5RelacionesUML.Ejercicio5_Computadora_PlacaMadre_Propietario;

public class TestEjercicio5 {
    public static void main(String[] args) {
        Computadora comp = new Computadora("Dell","SN-001","Z790 Pro","Intel Z790");
        Propietario prop = new Propietario("Carlos Ruiz","30999888");
        comp.setPropietario(prop);
        System.out.println(comp);
        System.out.println(prop);
    }
}
