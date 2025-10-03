package tp3POO;
public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Mascota: " + nombre + " (" + especie + "), Edad: " + edad + " años");
    }

    public void cumplirAnios() {
        edad++;
    }

    public static void main(String[] args) {
        Mascota m1 = new Mascota("Luna", "Perro", 3);
        m1.mostrarInfo();
        m1.cumplirAnios();
        System.out.println("Después de un año:");
        m1.mostrarInfo();
    }
}
