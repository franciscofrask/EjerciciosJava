package TP5RelacionesUML.Ejercicio2_Celular_Bateria_Usuario;
public class Bateria {
    private String modelo;
    private int capacidad; // mAh

    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Bateria{" +
                "modelo='" + modelo + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }
}
