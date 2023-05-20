import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tam;
        tam = in.nextInt();
        
        
        for (int linha = 0; linha < tam; linha++) {
            for (int coluna = 0; coluna < tam; coluna++) {
                if (
                    linha == 0 || linha == tam -1 || 
                    coluna == 0 || coluna == tam -1 ||
                    linha == coluna ||
                    linha == tam - coluna -1    
                ) {
                    System.out.print(" X ");
                } else {
                    System.out.print(" O ");
                }
            }
            System.out.println();
        }


    }
}