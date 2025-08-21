package vallegrande.edu.pe.model;

public class Estudiante {
    String nombre;
    int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrar() {
        System.out.println("Estudiante: " + nombre + " - Edad: " + edad);
    }
}
