import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        int linhas, colunas;
        int [] vet = { 1 };
        int [] aux;

        linhas = 5;
        
        for (int i = 0; i < linhas; i++) {
            
            for (int j = 0; j < vet.length; j++) {
                System.out.print(vet[j]);
            }
            System.out.println();
            
            aux = new int[vet.length + 1];
            aux[0] = 1;
            aux[aux.length -1] = 1;
        
            for (int j = 0; j < vet.length -1; j++) {
                aux[j+1] = vet[j] + vet[j+1];
            }

            vet = aux;
            
        }
    }
}