public class Alumno {
    private String curso;
    private byte sesion;
    private String objetivo;

    {
        System.out.println("I'm Alive!!!");
        curso = "Java SE I";
        sesion = 4;
        objetivo = "Dominar Java";
    }

    {
        System.out.println("HOLAAAAAA");
        curso = "Java Standar Edition I";
    }



    public String getCurso() {
        return curso;
    }

    public byte getSesion() {
        return sesion;
    }

    public String getObjetivo() {
        return objetivo;
    }
}
