package Ejemplo03;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("uno");
        lista.add("dos");
        lista.add("tres");
        lista.add("tres");
        lista.add("cuatro");
        /**
        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
         }*/
        for(String s : lista){
            System.out.println(s);
        }
    }
}
