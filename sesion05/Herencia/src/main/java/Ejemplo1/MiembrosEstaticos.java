package Ejemplo1;

public class MiembrosEstaticos {

    private static short contadorClase = 0;
    private short contadorInstancia = 0;

    public static short getContadorClase() {
        return contadorClase;
    }

    public short getContadorInstancia() {
        return contadorInstancia;
    }

    public MiembrosEstaticos() {
        contadorInstancia++;
        contadorClase++;
    }
}
