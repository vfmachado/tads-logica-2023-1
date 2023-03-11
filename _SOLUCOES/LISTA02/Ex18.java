import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float valorPorCarro, valorTotal, salario;
        int quantCarros;
        float aserpago;

        System.out.println("INFORME AS VARIAVEIS:");
        // le as variaveis;

        aserpago = valorPorCarro * quantCarros + salario + 0.05f * valorTotal;
        System.out.println("RENDIMENTOS DESTE MES: " + aserpago );

    }
}