import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade;
        String resultado;
        // categorias
        // adulto >=18
        // juvenil >= 14
        // infantil >= 9
        // mirim 

        System.out.println("Informe idade");
        idade = in.nextInt();

        if (idade >= 18) {
            resultado = "ADULTO";
        } else if (idade >= 14) {
            resultado = "JUVENIL";
        } else if (idade >= 9) {
            resultado = "INFANTIL";
        } else {
            resultado = "MIRIM";
        }
        
        System.out.println(resultado);
                
    }
}