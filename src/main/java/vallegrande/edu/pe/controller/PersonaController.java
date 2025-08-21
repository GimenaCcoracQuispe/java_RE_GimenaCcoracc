package vallegrande.edu.pe.controller;

import vallegrande.edu.pe.model.Persona;

public class PersonaController {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.nombre = "Juan";
        p.edad = 20;

        p.mostrarInfo();
        p.cumplirAnios();
    }
}
