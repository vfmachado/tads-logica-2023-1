import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        float nota1, nota2, media;

        float maior, menor, mediaDaMedia  = 0;
        maior = 0;
        menor = 999;

        for (int i = 0; i < n; i++) {
            System.out.println("Informe as notas do aluno " + i);
            nota1 = in.nextFloat();
            nota2 = in.nextFloat();

            media = (nota1 + nota2)/2;
            
            mediaDaMedia += media;

            if (media >  maior) {
                maior = media;
            }

            if (media < menor) {
                menor = media;
            }


            System.out.println("Media do aluno " + media);

        }
        
        mediaDaMedia = mediaDaMedia/n;
        System.out.println("Media da Media: " + mediaDaMedia);
        System.out.println("Menor Media: " + menor);
        System.out.println("Maior Media: " + maior);

    }
}