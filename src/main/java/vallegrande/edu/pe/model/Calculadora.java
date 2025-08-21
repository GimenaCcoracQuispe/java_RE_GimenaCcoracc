package vallegrande.edu.pe.model;

public class Calculadora {
    // Atributos
    private double numero1;
    private double numero2;

    // Métodos
    public double sumar() {
        return numero1 + numero2;
    }

    public double restar() {
        return numero1 - numero2;
    }

    // Setter para los números
    public void setNumeros(double n1, double n2) {
        this.numero1 = n1;
        this.numero2 = n2;
    }
}
