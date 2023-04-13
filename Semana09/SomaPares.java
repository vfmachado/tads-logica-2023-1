public class SomaPares {
    public static void main(String[] args) {

        int numero, contador;
        int soma = 0;
        
        contador = 2;
        numero = 12;

        while (contador <= numero) {
            System.out.println("CONTADOR: " + contador);

            soma = soma + contador;
            contador = contador + 2;
        }

        System.out.println("A SOMA DOS PARES DE 2 ATEH " + numero + " EH IGUAL A " + soma);

    }
}