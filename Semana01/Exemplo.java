import java.util.Scanner;

public class Exemplo {
    // faca um programa que calcule quantos metros quadrados tem uma sala dada suas dimensoes
    public static void main(String[] args) {

        // declaramos o scanner
        Scanner in;
        // inicializacao System.in -> teclado =)
        in  = new Scanner(System.in);

        // int representa valores inteiros
        int largura, comprimento;
        int area;
        
        System.out.println("Informe a largura e o comprimento:");
        // in.nextInt => recebe um valor inteiro atraves do scanner
        largura = in.nextInt();
        comprimento = in.nextInt();
        
        area = largura * comprimento;
        System.out.println("METROS QUAD: " + area);
    }
}