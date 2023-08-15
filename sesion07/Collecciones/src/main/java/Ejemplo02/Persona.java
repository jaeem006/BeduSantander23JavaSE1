package Ejemplo02;

public class Persona implements Comparable<Persona>{
    private String nombre;
    private String apellido;
    private float estatura;

    public Persona(String nombre, String apellido, float estatura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public float getEstatura() {
        return estatura;
    }

    @Override
    public int compareTo(Persona persona){
        /* if (this.estatura>persona.estatura){
            return 1;
        }else if(this.estatura==persona.estatura){
            return 0;
        }else {
            return -1;
        } */

        return Float.compare(this.estatura, persona.estatura);
    }
}

