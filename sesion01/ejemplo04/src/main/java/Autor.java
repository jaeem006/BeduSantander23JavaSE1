public class Autor {
    // ATRIBUTOS
    private String nombre;
    private String apellido;
    private int edad;
    //MÉTODOS (GETTERS Y SETTERS)
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
