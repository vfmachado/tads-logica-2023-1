import java.util.Scanner;
/*
Desenvolva o algoritmo de um programa onde o usuário irá informar um número inteiro e o programa deve calcular e exibir quadrado do número informado pelo usuário.
*/
public class Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // ENTRADA
        int numero;
        System.out.println("Informe um valor");
        numero = in.nextInt();

        // PROCESSAMENTO
        numero *= numero;
        /*
           a *= b   <=>   a = a * b
            +=      <=>   a = a + b
            -=      <=>   a = a - b
            /=      <=>   a = a / b

        */

        // SAÍDA
        System.out.println("QUADRADO: " + numero);
        
    }
}