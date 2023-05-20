import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int maior, media, quantidade, valor;

        maior = -999999;
        media = 0;
        quantidade = 0;

        for (quantidade = 0 ;  valor != 0 ; quantidade++) {
            valor = in.nextInt();
            
            media += valor;

            if (valor >  maior) {
                maior = valor;
            }
        }

        quantidade = quantidade - 1;    //quantidade--;

        media = media/quantidade;
        System.out.println("QUANT: " + quantidade);
        System.out.println("MEDIA: " + media);
        System.out.println("MAIOR: " + maior);

    }
}