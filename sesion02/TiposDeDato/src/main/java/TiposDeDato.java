public class TiposDeDato {
    public static void main(String[] args) {
        byte valorByte = 1;
        short valorShort = 1;
        int valorInt = 1;
        long valorLong = 1L;

        float valorFloat = 1.9999F;
        double valorDouble = 1.5;

        boolean valorBool = true;
        char valorChar = 'B';

        int numF = (int) valorFloat;

        int num = valorInt + numF;

        System.out.println(num);

        int numC = (int)valorChar;

        int num2 = valorInt + valorChar;

        char char1 = (char)num2;

        System.out.println(char1);

        // int numB = (int)valorBool;

        valorInt = valorInt + 1;
        System.out.println(valorInt);
        valorInt++;
        System.out.println(valorInt);
        valorInt--;
        System.out.println(valorInt);

        valorChar++;
        System.out.println(valorChar);
    }
}
