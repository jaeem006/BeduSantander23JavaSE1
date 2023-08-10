package Ejemplo02;

public class Persona {
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void mostrarInfo(){
        System.out.println("Persona(nombre: "+nombre + "apellido: "+apellido + ")");
    }
}
