import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor;

        // mostra msg
        System.out.println("Informe um valor inteiro");
    
        // le o valor
        valor = in.nextInt();

        // compara com zero
        // se menor que zero
        if (valor < 0) {
            // mostra negativo
            System.out.println("NEGATIVO!");

        // se maior que zero
        } else if (valor == 1234){
            System.out.println("VALOR POSITIVO E IGUAL a 1234 QUE PODE SER A SENHA DO ADMIN ");
        } else if (valor > 0) {
            System.out.println("VALOR POSITIVO E MAIOR QUE ZERO");
        // se igual a zero 
        } else {
            System.out.println("VALOR IGUAL A ZERO");
        }
        
        
        
        
        
                
    }
}