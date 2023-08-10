package Ejemplo02;

public class ProfesorInterino extends Profesor{
    private String fechaTerminacion;

    public ProfesorInterino(String nombre, String apellido, String idProfesor, String fechaTerminacion) {
        super(nombre, apellido, idProfesor);
        this.fechaTerminacion = fechaTerminacion;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("P.I.(fecha: "+ fechaTerminacion +")");
    }
}
