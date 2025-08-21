package vallegrande.edu.pe.controller;

import vallegrande.edu.pe.model.Circulo;

public class CirculoController {
    public static void main(String[] args) {
        Circulo c = new Circulo();
        c.radio = 5;

        System.out.println("Área: " + c.calcularArea());
        System.out.println("Perímetro: " + c.calcularPerimetro());
    }
}
