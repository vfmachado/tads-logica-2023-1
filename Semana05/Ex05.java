import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h1, h2, m1, m2, somatorio, produto;
        System.out.println("Informe as 4 idades, h, h, m, m");
        h1 = in.nextInt();
        h2 = in.nextInt();
        m1 = in.nextInt();
        m2 = in.nextInt();
       
        if (h1 > h2 && m1 < m2) {

        }
        if (h1 < h2 && m1 < m2) {
            
        }
        if (h1 > h2 && m1 > m2) {

        }
        if (h1 < h2 && m1 > m2) {
            
        }

        // homem 1 mais velho
        if (h1 > h2) {
            // mulher 1 mais nova
            if (m1 < m2) {
                
            // mulher 2 mais nova
            } else {

            }
        // homem 2 mais velho
        } else {
            // mulher 1 mais nova
            if (m1 < m2) {
                
            // mulher 2 mais nova
            } else {

            }
        }

    }
}
