package TP5RelacionesUML.Ejercicio5_Computadora_PlacaMadre_Propietario;

class PlacaMadre {
    private String modelo;
    private String chipset;

    PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public String getChipset() { return chipset; }
    public void setChipset(String chipset) { this.chipset = chipset; }

    @Override
    public String toString() {
        return "PlacaMadre{" +
                "modelo='" + modelo + '\'' +
                ", chipset='" + chipset + '\'' +
                '}';
    }
}
