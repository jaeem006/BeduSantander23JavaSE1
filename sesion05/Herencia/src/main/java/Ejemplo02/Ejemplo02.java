package Ejemplo02;

public class Ejemplo02 {
    public static void main(String[] args) {
        Triangulo t = new Triangulo(4.5, 5.2, "I");
        System.out.println(t.area());
        t.mostrarDimension();
        Rectangulo r = new Rectangulo(3.5,4.2);
        System.out.println(r.area());
        r.mostrarDimension();
    }
}
