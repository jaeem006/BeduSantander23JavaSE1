import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("¡Hola " + nombre + "!");
    }
}
