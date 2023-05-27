
import java.util.Scanner;

public class L08Ex08 {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // declaracao de um valor de 10 inteiros;
        int [] vetor;
        vetor = new int[10];
        
        // ler um valor para cada posicao
        int valoresMaiores = 0;

        System.out.println("Informe 10 valores para os vetores: ");        
        for (int i = 0; i < 10; i++) {            
            vetor[i] = in.nextInt();   
        }

        // for para mostrar o vetor
        for(int i = 0;i<vetor.length;i++) {
            System.out.printf("Vetor[%d]: %d\n", i, vetor[i]);
        }
        
        System.out.println("ESCOLHA UM ELEMENTO (posicao)");
        int posEscolhida = in.nextInt();

        for(int i = 0;i<vetor.length;i++) {
            if(vetor[posEscolhida]<vetor[i]) {
                valoresMaiores++;
                System.out.println(vetor[i]);
            }
        }
        System.out.println("Maiores: " + valoresMaiores);



    }
}