import java.util.Scanner;

public class L08Ex02 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int [] lancamentos, lados;

        lancamentos = new int[1000];
        lados = new int[6];

        int posicao = 0;
        while (true) {
            
            System.out.println("resultado do lancamento?");
            int resultado = in.nextInt();

            if (resultado < 0 || resultado > 5) break;

            lancamentos[posicao] = resultado;
            posicao++;

            lados[resultado]++;

        }


        System.out.println("Total de lancamentos " + posicao);

        for (int i = 0; i < lados.length; i++) {
            System.out.println("LADO " + (i+1) + " => " + lados[i]);    
        }
        
    }
}