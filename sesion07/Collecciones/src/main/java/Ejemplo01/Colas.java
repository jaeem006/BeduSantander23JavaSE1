package Ejemplo01;

import java.util.PriorityQueue;
import java.util.Queue;

public class Colas {
    public static void main(String[] args) {
        Queue<String> cola = new PriorityQueue<>();

        cola.add("uno");
        cola.add("dos");
        cola.add("tres");
        cola.add("cuatro");
        cola.add("cinco");

        for (String s : cola) {
            System.out.println(s);
        }

        System.out.println("-------------------");

        String valor = null;

        System.out.println(cola.peek());

        System.out.println("-------------------");

        while ((valor = cola.poll()) != null){
            System.out.println(valor);
        }

        System.out.println("-------------------");

        Queue<Libro> colaL = new PriorityQueue<>();

        colaL.add(new Libro("uno", 10));
        colaL.add(new Libro("dos", -7));
        colaL.add(new Libro("tres", 0));

        Libro l = null;

        while ((l = colaL.poll()) != null){
            System.out.println(l.getTitulo());
        }

    }
}
