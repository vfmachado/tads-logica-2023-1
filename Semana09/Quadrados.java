public class Quadrados {
    public static void main(String[] args) {

        int n = 5;
        int colunas = 0;
        int linhas = 0;
        while (linhas < n) {
            while (colunas < n) {
                System.out.print(" * ");
                colunas++;
            }
            colunas = 0;
            linhas++;
            System.out.println();
        }
        

        int contador = 0;
        while (contador < n * n) {
            if (contador % n == 0) {
                System.out.println();
            }
            System.out.print(" * ");
            contador++; 
        }

        System.out.println();
    }
}