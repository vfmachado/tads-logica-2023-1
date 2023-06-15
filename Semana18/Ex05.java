public class Ex05 {
    public static void main(String[] args) {
        
        int [][] sudoku = {
            { 1, 2, 3,  4, 0, 0,  0, 0, 0},
            { 2, 3, 4,  1, 0, 0,  0, 0, 0},
            { 0, 0, 0,  0, 0, 0,  0, 0, 0},
            { 0, 0, 0,  0, 0, 0,  0, 0, 0},
            { 0, 0, 0,  0, 0, 0,  0, 0, 0},
            { 0, 0, 0,  0, 0, 0,  0, 0, 0},
            { 0, 0, 0,  0, 0, 0,  0, 0, 0},
            { 0, 0, 0,  0, 0, 0,  0, 0, 0},
            { 0, 0, 0,  0, 0, 0,  0, 0, 0},
        };

        boolean tabuleiroValido = true;

        // comparar os valores de uma linha
        for (int linha = 0; linha < 9; linha++) {

            // para cada uma das linhas, vamos comparar o valor com os demais
            System.out.println("COMPARANDO para a linha " + linha);
            for (int comparador = 0; comparador < sudoku.length; comparador++) {
                for (int alvo = comparador+1; alvo < sudoku.length; alvo++) {
                    if (sudoku[linha][comparador] != 0 && sudoku[linha][alvo] != 0) {
                        System.out.println(sudoku[linha][comparador] + "<=>" + sudoku[linha][alvo]);
                        if (sudoku[linha][comparador] == sudoku[linha][alvo]) {
                            tabuleiroValido = false;
                        }
                    }
                }
                // System.out.println();
            } 

            System.out.println("TABULEIRO VALIDO: " + tabuleiroValido);
        }
    }
}
