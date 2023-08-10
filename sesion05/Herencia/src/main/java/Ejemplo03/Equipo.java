package Ejemplo03;

public class Equipo {
    private String nombre;
    private String ciudad;
    private int puntos;

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getPuntos() {
        return puntos;
    }

    public Equipo(String nombre, String ciudad, int puntos) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.puntos = puntos;
    }

    public Equipo(String nombre, String ciudad){
        this(nombre, ciudad, 0);
    }

    public Equipo(String ciudad){
        this("Anónimo",ciudad);
    }

    public Equipo(int puntos){
        this("Anónimo", "Sin lugar", puntos);
    }

    public void actualiza(String nombre, int puntos){
        this.nombre = nombre;
        this.puntos = puntos;
    }

    public void actualiza(String nombre){
        this.nombre = nombre;
    }

    public void actualiza(int puntos){
        this.puntos = puntos;
    }

    public void actualiza(int nombre, String puntos){

    }

}
