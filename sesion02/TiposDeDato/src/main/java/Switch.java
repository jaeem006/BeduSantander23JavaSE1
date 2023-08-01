public class Switch {


    public static void main(String[] args) {
        boolean b = false;

        if (b) {
            System.out.println("B es verdadero");
        } else {
            System.out.println("B es falsa");
        }

        String mensaje;
        byte calificacion = 4;

        switch(calificacion){
            case 10:
                mensaje = "¡Excelente!";
                break;
            case 9:
            case 8:
                mensaje = "Muy Bien";
                break;
            case 7:
                mensaje = "Bien hecho";
                break;
            case 6:
                mensaje = "Pasaste";
                break;
            default :
                mensaje = "Mejor vuelve a intentarlo";
        }

        System.out.println(mensaje);

        String mes = "Enero";

        switch (mes) {
            case "Enero" :
                System.out.println("Febrero");
            case  "Febrero":
                System.out.println("Marzo");
            case  "Marzo":
                System.out.println("Abri");
            case  "Abril":
                System.out.println("Mayo");
            case  "Mayo":
                System.out.println("Junio");
            case  "Junio":
                System.out.println("Julio");
            case  "Julio":
                System.out.println("Agosto");
            case  "Agosto":
                System.out.println("Septiembre");
            case  "Septiembre":
                System.out.println("Octubre");
            case  "Octubre":
                System.out.println("Noviembre");
            case  "Noviembre":
                System.out.println("Diciembre");
            default:
                System.out.println("El año terminó");
        }
    }

}
