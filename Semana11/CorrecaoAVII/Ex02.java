import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int d1,d2, soma;
        System.out.println("informe os dois digitos");
        d1 = in.nextInt();
        d2 = in.nextInt();

        soma = d1 + d2;
        switch (soma) {
            case 0:
                System.out.println("MUSICA 0");
                break;
            case 1:
                System.out.println("MUSICA 1");
                break;
            case 2:
                System.out.println("MUSICA 2");
                break;
            case 3:
                System.out.println("MUSICA 3");
                break;
        }
    }
}