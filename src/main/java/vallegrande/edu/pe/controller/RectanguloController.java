package vallegrande.edu.pe.controller;

import vallegrande.edu.pe.model.Rectangulo;

public class RectanguloController {
    public static void main(String[] args) {
        Rectangulo r = new Rectangulo();
        r.setDimensiones(10, 5);

        System.out.println("Área del rectángulo: " + r.calcularArea());
    }
}
