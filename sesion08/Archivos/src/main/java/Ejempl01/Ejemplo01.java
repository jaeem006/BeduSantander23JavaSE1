package Ejempl01;

import java.io.File;

public class Ejemplo01 {

    public static void main(String[] args) {
        File archivo = new File("/Users/javierenriquezmendoza/Documentos/Bedu/santander232/sesion08/Archivos/src/main/resources/cursos/cursos.txt");

        System.out.println("Nombre del archivo: " + archivo.getName());
        System.out.println("Ruta: " + archivo.getPath());
        System.out.println("Ruta Absoluta: " + archivo.getAbsolutePath());
        System.out.println("Padre: " + archivo.getParent());
        System.out.println("Existe: " + archivo.exists());
        System.out.println("Ocultos: " + archivo.isHidden());

        if(archivo.exists()){
            System.out.println("Escritura: " + archivo.canWrite());
            System.out.println("Lectura: " + archivo.canRead());
            System.out.println("Ejecutable: "+ archivo.canExecute());
            System.out.println("Directorio: "+ archivo.isDirectory());
            System.out.println("Tamaño: " + archivo.length());
        }


    }
}
