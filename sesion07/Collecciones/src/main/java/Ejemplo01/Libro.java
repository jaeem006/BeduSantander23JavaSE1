package Ejemplo01;

public class Libro implements Comparable<Libro> {
    private String titulo;
    private int prioridad;

    public Libro(String titulo, int prioridad){
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    public String getTitulo(){
        return titulo;
    }

    @Override
    public int compareTo(Libro libro){
        return this.prioridad - libro.prioridad;
    }
}
