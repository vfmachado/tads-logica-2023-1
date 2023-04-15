import java.util.Scanner;

public class L04Ex27 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int valor, n, dobro, soma, contador = 0;
        System.out.println("informe o valor e a quantidade de vezes");
        valor = in.nextInt();
        n = in.nextInt();
        
        while (contador < n) {
            System.out.println(contador);
            
            valor = valor * 2;
            soma = valor + valor/2;
            System.out.println("Dobro: " + valor);
            System.out.println("Soma com antecessor " + soma);
            //valor = dobro;
            contador++;
        }

    }
}
