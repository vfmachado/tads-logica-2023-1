import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int maior, media, quantidade, valor;

        maior = -999999;
        media = 0;
        quantidade = 0;

        while (true) {
            valor = in.nextInt();
            if (valor == 0) break;

            quantidade++;
            media += valor;

            if (valor >  maior) {
                maior = valor;
            }
        }

        media = media/quantidade;
        System.out.println("QUANT: " + quantidade);
        System.out.println("MEDIA: " + media);
        System.out.println("MAIOR: " + maior);

    }
}