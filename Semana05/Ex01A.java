import java.util.Scanner;

public class Ex01A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float largura, comprimento, altura, areaTotal, qtdCaixas;
        float caixa = 1.5f;
        

        System.out.println("informe as dimensoes da cozinha, largura, comprimento, altura");
        largura = in.nextFloat();
        comprimento = in.nextFloat();
        altura = in.nextFloat();

        areaTotal = largura * altura * 2  + comprimento * altura * 2;
        qtdCaixas = areaTotal / caixa;
        System.out.println("QUANTIDADE DE CAIXAS: " + qtdCaixas);
    }
}