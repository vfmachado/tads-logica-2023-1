import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        int [] a = { 1, 2, 3, 4, 5};
        int [] b = { 1, 2, 3};

        int quantidadeQueTem = 0;
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                
                if (a[i] == b[j]) {
                    quantidadeQueTem++;
                }

            }
        }

        if (quantidadeQueTem == b.length) {
            System.out.println("Subconjunto");
        } else {
            System.out.println("NAO EH Subconjunto");
        }
    }
}