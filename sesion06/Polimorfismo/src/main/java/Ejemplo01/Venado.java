package Ejemplo01;

public class Venado extends Animal implements Herbivoro{

    @Override
    public int foo(int x){
        return x;
    }

    @Override
    public boolean zoo(int y) {
        return y >= 0;
    }
}
