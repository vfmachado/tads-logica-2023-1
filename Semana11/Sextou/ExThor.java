import java.util.Scanner;

public class ExThor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int quantidade = in.nextInt();
        String nome;
        int forca;

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Informe um nome e a forca");
            nome = in.next();
            forca = in.nextInt();

            if (nome.equals("THOR")) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
    }
}