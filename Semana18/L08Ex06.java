public class L08Ex06 {
    public static void main(String[] args) {
        char[] palavra;

        String texto = "VINICIUS";
        palavra = new char[texto.length()];

        for (int i = 0; i < palavra.length; i++) {
            palavra[i] = texto.charAt(0);
        }

        char[] mesmaPalavra = texto.toCharArray();

        mesmaPalavra[0] = 'a';
    }
}
