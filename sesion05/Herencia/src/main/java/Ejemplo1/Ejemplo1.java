package Ejemplo1;

public class Ejemplo1 {
    public static void main(String[] args) {

        System.out.println("Antes de inicializar: "+ MiembrosEstaticos.getContadorClase());

        MiembrosEstaticos m1 = new MiembrosEstaticos();
        System.out.println("Contador de clase m1: " + MiembrosEstaticos.getContadorClase());
        System.out.println("Contador de instancia m1: " + m1.getContadorInstancia());

        MiembrosEstaticos m2 = new MiembrosEstaticos();
        System.out.println("Contador de clase m2: " + MiembrosEstaticos.getContadorClase());
        System.out.println("Contador de instancia m2: " + m2.getContadorInstancia());

        MiembrosEstaticos m3 = new MiembrosEstaticos();
        System.out.println("Contador de clase m3: " + MiembrosEstaticos.getContadorClase());
        System.out.println("Contador de instancia m3: " + m3.getContadorInstancia());
    }
}
