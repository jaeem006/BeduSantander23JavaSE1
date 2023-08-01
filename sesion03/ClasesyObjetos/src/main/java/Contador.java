public class Contador {
    public boolean isVocal(char c){
        return (
                c == 'a' || c == 'e' || c == 'i' || c == 'o' || c =='u'
                );
    }

    public boolean isNumero(char c){
        short codigoAscii = (short) c;
        return codigoAscii >= 48 && codigoAscii <= 57;
    }

    public boolean isConsonante(char c){
        short codigoAscii = (short) c;
        return codigoAscii >= 97 && codigoAscii <= 122 && !isVocal(c);
    }

    public boolean isSimbolo(char c){
        return (!isVocal(c) && !isConsonante(c) && !isNumero(c));
    }

    public int cuentaVocales(String s){
        int contador = 0;
        for(char c : s.toCharArray()){
            if (isVocal(c)){
                contador++;
            }
        }
        return contador;
    }

    public int cuentaNumeros(String s){
        int contador = 0;
        for (char c : s.toCharArray()){
            if(isNumero(c)){
                contador++;
            }
        }
        return contador;
    }

    public int cuentaConsonantes(String s){
        int contador = 0;
        for (char c : s.toCharArray()){
            if(isConsonante(c)){
                contador++;
            }
        }
        return contador;
    }

    public int cuentaSimbolo(String s){
        int contador = 0;
        for (char c : s.toCharArray()){
            if(isSimbolo(c)){
                contador++;
            }
        }
        return contador;
    }
}
