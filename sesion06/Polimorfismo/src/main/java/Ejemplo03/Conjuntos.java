package Ejemplo03;

import java.util.HashSet;
import java.util.Set;

public class Conjuntos {
    public static void main(String[] args) {
        Set<String> conunto = new HashSet<>();

        conunto.add("uno");
        conunto.add("dos");
        conunto.add("tres");
        conunto.add("tres");
        conunto.add("cuatro");

        for (String s: conunto){
            System.out.println(s);
        }

        System.out.println("----------------");

        Set<Numero> conjunto2 = new HashSet<>();

        conjunto2.add(new Numero("uno"));
        conjunto2.add(new Numero("dos"));
        conjunto2.add(new Numero("tres"));
        conjunto2.add(new Numero("tres"));
        conjunto2.add(new Numero("cuatro"));

        for (Numero n : conjunto2){
            System.out.println(n.getNombre());
        }
    }
}
