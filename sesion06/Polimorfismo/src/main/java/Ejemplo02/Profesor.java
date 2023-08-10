package Ejemplo02;

public class Profesor extends Persona{

    private String idProfesor;

    public Profesor(String nombre, String apellido, String idProfesor){
        super(nombre, apellido);
        this.idProfesor = idProfesor;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Profesor(id: "+ idProfesor+ ")");
    }


}
