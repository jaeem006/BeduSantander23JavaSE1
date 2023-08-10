package Ejemplo03;

public class Numero {
    private String nombre;

    public Numero(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;

        Numero n = (Numero) o;

        return nombre.equals(n.getNombre());
    }

    @Override
    public int hashCode(){
       return nombre != null ? nombre.hashCode() : 0;
    }
}
