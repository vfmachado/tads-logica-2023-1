import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float comprimentoMetros = 2000;
        float kml = 5;
        float qlitros, totalPercorrer, percorrer1abastecimento;
        int quantReabestecimento = 4;   
        int numeroVoltas = 50;

        // SYSTEM.OUT.PRINTLN E LEITURA DAS VARIAVEIS;
        

        // transformar em km e multiplicar pela quantidade de voltas
        totalPercorrer = comprimentoMetros/1000  * numeroVoltas;
        percorrer1abastecimento = totalPercorrer / quantReabestecimento;

        qlitros = percorrer1abastecimento / kml;
        System.out.println("VOCE DEVE ABASTERCER " + qlitros + " LITROS");

    }
}