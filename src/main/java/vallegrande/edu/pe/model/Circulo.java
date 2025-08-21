package vallegrande.edu.pe.model;

public class Circulo {
    public double radio;

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
