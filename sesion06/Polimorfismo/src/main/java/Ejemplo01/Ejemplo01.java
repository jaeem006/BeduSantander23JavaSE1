package Ejemplo01;

public class Ejemplo01 {
    public static void main(String[] args) {
        Venado v = new Venado();
        System.out.println("Venado: "+ (v instanceof Venado));
        System.out.println("Object: "+ (v instanceof Object));
        System.out.println("Animal: "+ (v instanceof Animal));
        System.out.println("Hervivoro: "+ (v instanceof Herbivoro));
        Object o = new Object();
        System.out.println("Objecto: "+ (o instanceof Venado));
    }
}
