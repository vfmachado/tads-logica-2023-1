public class Digitos {
    public static void main(String[] args) {

        int numero = 923;
        int digito, multiplicacao = 1;


        while (numero > 0) {
            digito = numero % 10;
            //System.out.println(digito);
            multiplicacao = multiplicacao * digito;

            numero = numero / 10;
        }
        
        System.out.println(" DIGITOS MULTIPLICADOS = " + multiplicacao);
    }
}