package vallegrande.edu.pe.model;

public class Rectangulo {
    double base;
    double altura;

    public void setDimensiones(double b, double h) {
        base = b;
        altura = h;
    }

    public double calcularArea() {
        return base * altura;
    }
}
