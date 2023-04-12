import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 1;
        float nota;
        float media = 0;
        do {
            System.out.print("INFORME A " + a  + "a NOTA: ");
            nota = in.nextFloat();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota invalida, informe novamente ... CONTINUANDO");
                continue;
            }
            a++;
            media = media + nota;
            // media += nota;
        } while (a <= 10);

        // do {
        //     System.out.print("INFORME A " + a  + "a NOTA: ");
        //     nota = in.nextFloat();
        //     if (nota >= 0 && nota <= 10) {
        //         a++;
        //         media = media + nota;
        //     } else {
        //         System.out.println("Nota invalida, informe novamente ... CONTINUANDO");
        //     }
        // } while (a <= 10);

        System.out.println("a => " + a);
        System.out.println("media => " + (media/10));
    }
}