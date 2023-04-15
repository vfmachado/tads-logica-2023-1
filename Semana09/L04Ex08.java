import java.util.Scanner;

public class L04Ex08 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int quantMercadorias;
        float valorDeCadaMercadoria;
        float valorTotalEstoque = 0;
        float media;

        System.out.println("Quantas mercadorias vc tem?");
        quantMercadorias = in.nextInt();
        int contador = 1;

        while (contador <= quantMercadorias) {
            System.out.println("Informe o valor da mercadoria " + contador);
            valorDeCadaMercadoria = in.nextFloat();
            valorTotalEstoque = valorTotalEstoque + valorDeCadaMercadoria;
            contador++;
        }
        
        System.out.println("VALOR TOTAL $$ " + valorTotalEstoque);
        media = valorTotalEstoque / quantMercadorias;
        System.out.println("VALOR MEDIO DOS PRODUTOS: "+ media);
    }
}