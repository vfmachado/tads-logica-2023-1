import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        boolean crescente = true;
        int [] vet = { 1, 6, 5, 3, 4, 2};
        int [] ord = new int[vet.length];
        for (int i = 0; i < ord.length; i++) {
            ord[i] = vet[i];
        }

        for (int i = 0; i < ord.length; i++) {
            for (int j = i + 1; j < ord.length; j++) {
                
                if (crescente) {
                    if (ord[j] < ord[i]) {
                        int aux = ord[i];
                        ord[i] = ord[j];
                        ord[j] = aux;
                    }
                } else {
                    if (ord[j] > ord[i]) {
                        int aux = ord[i];
                        ord[i] = ord[j];
                        ord[j] = aux;
                    }
                }

            }
        }


        System.out.println("VETOR ORDENADO");
        for (int i = 0; i < ord.length; i++) {
            System.out.println(ord[i] + "  ");
        }
    }

}