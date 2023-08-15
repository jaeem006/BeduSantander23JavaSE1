package Ejemplo02;

import Ejemplo01.Libro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejemplo02 {
    public static void main(String[] args) {
        Persona maria = new Persona("Maria", "Buenrostro", 1.62F);
        Persona arturo = new Persona("Arturo", "Molina", 1.7F);
        Persona karla = new Persona("Karla", "Esquivel", 1.61F);

        List<Persona> lista = new ArrayList<>();

        lista.add(maria);
        lista.add(arturo);
        lista.add(karla);

        Collections.sort(lista);

        for (Persona p : lista){
            System.out.println(p.getNombre()+ " " + p.getEstatura());
        }
    }
}
