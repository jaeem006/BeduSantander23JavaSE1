public class Letras {
    public static void main(String[] args) {
        Lector lector = new Lector();
        lector.muestraMensaje("Escribe el texto:");
        String texto = lector.leeEntrada();
        texto = texto.toLowerCase();

        Contador contador = new Contador();
        int numV = contador.cuentaVocales(texto);
        int numN = contador.cuentaNumeros(texto);
        int numC = contador.cuentaConsonantes(texto);
        int numS = contador.cuentaSimbolo(texto);

        lector.muestraMensaje("Hay "+ numV + " Vocales");
        lector.muestraMensaje("Hay "+ numN + " Numeros");
        lector.muestraMensaje("Hay "+ numC + " Consonantes");
        lector.muestraMensaje("Hay "+ numS + " Simbolos");
        
    }
}
