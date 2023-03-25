// FACA UM PROGRAMA DE DADO UM NUMERO INTEIRO, >= 1 E MENOR OU IGUAL A 8 (FAZER A VERIFICAO), CALCULAR O FATORIAL DESTE NUMERO.
// O FATORIAL DE UM NUMERO É CALCULADO, MULTIPLICANDO O NUMERO PELO FATORIAL DO SEU ANTECESSOR, CONSIDERANDO QUE FATORIAL DE ZERO É 1, TEMOS UMA FUNCAO MATEMATICA RECURSIVA.
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero, fatorial;
        System.out.println("INFORME UM NUMERO");
        numero = in.nextInt();
        
        if (numero >= 1 && numero <= 8) {
            System.out.println("NUMERO VALIDADO COM SUCESSO... CALCULANDO O FATORIAL...");
            /*
            fatorial = numero;
            while (numero > 1) {
                numero--;
                fatorial = fatorial * numero;
            }
            */

            /*
            int contador = 1;
            fatorial = numero;
            while (numero - contador > 1) {
                fatorial = fatorial * (numero - contador);
                contador++;
            }
            */

            int contador = 1;
            fatorial = numero;
            while (contador < numero) {
                fatorial = fatorial * contador;
                contador++;
            } 
        

            System.out.println("FATORIAL: " + fatorial);
        } else {
            System.out.println("NUMERO INVALIDO... FINALIZANDO O PROGRAMA");
        }
    }
}