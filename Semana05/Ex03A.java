import java.util.Scanner;

public class Ex03A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n1, n2, n3, valor;
        int qtd1, qtd2, qtd3;

        System.out.println("informe o valor das 3 cedulas disponiveis");
        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();

        System.out.println("Informe quanto vc quer sacar");
        valor = in.nextInt();

        qtd3 = valor / n3;
        System.out.println("QUANTIDADE DE " + n3  + " EH " + qtd3 );
        valor = valor % n3;


        qtd2 = valor / n2;
        System.out.println("QUANTIDADE DE " + n2  + " EH " + qtd2 );
        valor = valor % n2;

        qtd1 = valor / n1;
        System.out.println("QUANTIDADE DE " + n1  + " EH " + qtd1 );
    }
}