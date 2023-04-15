import java.util.Scanner;

public class L04Ex29 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int valorInicial, valorFinal, contador;

        System.out.println("Informe o valor inicial e final");
        valorInicial = in.nextInt();
        valorFinal = in.nextInt();

        contador = valorInicial;
        while (contador <= valorFinal) {
            System.out.println(contador);

            int numero = contador;
            int digito, multiplicacao = 1;

            while (numero > 0) {
                digito = numero % 10;
                //System.out.println(digito);
                multiplicacao = multiplicacao * digito;

                numero = numero / 10;
            }
            
            System.out.println(" DIGITOS MULTIPLICADOS = " + multiplicacao);
            contador++;
        }
 

    }
}
