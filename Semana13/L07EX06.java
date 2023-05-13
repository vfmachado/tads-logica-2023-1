import java.util.Scanner;

public class L07EX06 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String nome;
        char genero;
        float salario;

        float somaM = 0;
        int quantM = 0;
        float maiorM = 0;


        for ( int i = 0; i < n; i++) {
            System.out.println("Informe nome, genero e salario");
            nome = in.next();
            genero = in.next().toUpperCase().charAt(0);
            salario = in.nextFloat();

            if (genero == 'M') {
                System.out.println("MASCULINO");
                somaM = somaM + salario;
                quantM++;
                System.out.println("SOMA M " + somaM);
                System.out.println("QUANT M " + quantM);

                if (salario > maiorM) {
                    maiorM = salario;
                }
            }
        }

        float mediaM = somaM / quantM;
        System.out.println("SALARIO MEDIO DO GENERO M " + mediaM);
    }
}