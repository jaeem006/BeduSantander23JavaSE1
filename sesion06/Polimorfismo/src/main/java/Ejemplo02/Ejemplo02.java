package Ejemplo02;

public class Ejemplo02 {
    public static void main(String[] args) {
        Persona p0 = new Persona("Eduardo", "Sanchez");
        Profesor p1 = new Profesor("Juan", "Molina","001122");
        Profesor p2 = new ProfesorInterino("Luisa",
                "Ruiz",
                "112233",
                "hoy");

        Object p3 = new ProfesorInterino("Adela",
                "Martinez",
                "33213",
                "hoy");

        p0.mostrarInfo();
        p1.mostrarInfo();
        p2.mostrarInfo();
    }

}
