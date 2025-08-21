package vallegrande.edu.pe.model;

public class Persona {
    public String nombre;
    public int edad;

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }

    public void cumplirAnios() {
        edad++;
        System.out.println(nombre + " ahora tiene " + edad + " años.");
    }
}
