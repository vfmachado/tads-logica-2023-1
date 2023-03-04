import java.util.Scanner;

/*
    // se o valor da minha variavel é verdadeiro, entao executa BLOCO 1, senao executa o BLOCO 2
    if (valor_boolean) {
        // BLOCO 1
    } else {
        // BLOCO 2
    }

*/

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // UM INGRESSO PARA UM EVENTO CUSTA 100 REAIS;
        // CRIANCAS ABAIXO DE 14 ANOS PAGAM MEIA

        // FACA UM PROGRAMA QUE DADA A IDADE DE UMA PESSOA, INDIQUE O VALOR A SER PAGO;
        int idade;
        float valor = 100.0f;
        boolean pagaMeia;

        System.out.println("Informe a sua idade");
        idade = in.nextInt();

        pagaMeia = idade <= 14;
        
        System.out.println("PAGA MEIA " + pagaMeia);

        // SE PAGA MEIA, ENTÃO MOSTRA 50
        if (pagaMeia) {
            System.out.println("EXECUTADO!!!");
             valor = valor / 2;
            // valor /= 2;

            System.out.printf("Valor da Entrada R$ %.2f\n", valor);
        }

        // SENAO , ENTAO MOSTRA 100
        // !  significa NÃO
        else {
            System.out.printf("Valor da Entrada R$ %.2f\n", valor);
        }


       


    }
}