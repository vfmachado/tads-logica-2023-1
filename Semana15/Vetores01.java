public class Vetores01 {
    public static void main(String[] args) {

        // DECLARAR UM VETOR DE INTEIROS DE TAMANHO 5
        int [] valores;

        // alocacao de maneira estatica
        valores = new int[5];       // sao alocados 5 "espacos" na variavel valores;
     
        valores[0] = 31;
        valores[1] = 19;
        valores[2] = 22;
        valores[3] = 16;
        valores[4] = 30;

        System.out.println("VALORES => " + valores);

        // tamanho do vetor = vetor.length
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("valores[%d] => %d\n", i, valores[i]);
            //System.out.println("VALOR NA POSICAO " + i+  " EH " + valores[i]);
        }
    }   
}