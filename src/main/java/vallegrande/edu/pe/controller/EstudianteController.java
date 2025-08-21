package vallegrande.edu.pe.controller;

import vallegrande.edu.pe.model.Estudiante;

public class EstudianteController {
    public static void main(String[] args) {
        Estudiante e = new Estudiante("María", 22);
        e.mostrar();
    }
}
