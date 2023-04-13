public class Cidades {
    public static void main(String[] args) {

        int popA = 100000;
        int popB = 101000;

        final float txA = 1.03f;
        final float txB = 1.02f;
        
        int quantidadeAnos = 0;

        while (popA < popB) {
            System.out.println("anos: " + quantidadeAnos);
            System.out.println("pop A " + popA);
            System.out.println("pop B " + popB);
            System.out.println("===========\n\n");

            // O (int) converte o resultado da operaçao entre parenteses para inteiro;
            popA = (int) (popA * txA);
            popB = (int) (popB * txB);

            quantidadeAnos++;
        }

        System.out.println("ANOS NECESSARIOS: " + quantidadeAnos);
    }
}