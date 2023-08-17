import java.io.*;
import java.time.LocalDate;
import java.time.Month;

public class Archivo {
    public static void main(String[] args) throws IOException {
        final String NOMBRE = "Beto";
        final int EDAD = 23;
        final float PROMEDIO = 8.4F;
        final LocalDate FECHA_NACIMIENTO = LocalDate.of(1996, Month.FEBRUARY, 21);

        System.out.println("Mi nombre es " + NOMBRE + ", tengo " + EDAD + " años, mi promedio es de " + PROMEDIO + " y nací el día " + FECHA_NACIMIENTO);

        
    }

}
