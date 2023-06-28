
public class E2 {
    public static void main(String[] args) {
        
        char [] gabarito = { 'A', 'A', 'B', 'D', 'C'};
        char [][] respostas = {
            { 'A', 'A', 'B', 'D', 'C'},
            { 'A', 'A', 'B', 'D', 'N'},
            { 'B', 'B', 'B', 'D', 'C'},
            { 'A', 'N', 'B', 'D', 'N'},
            { 'A', 'A', 'B', 'D', 'C'}
        };

        for (int aluno = 0; aluno < respostas.length; aluno++) {
            int nota = 0;
            for (int pergunta = 0; pergunta < respostas.length; pergunta++) {
                
                if (respostas[aluno][pergunta] == gabarito[pergunta]) {
                    nota += 2;
                } else if (respostas[aluno][pergunta] == 'N') {

                } else {
                    nota = nota -1;
                }

            }

            // VERIFICAR MAIOR E MENOR NOTA DA TURMA
            System.out.println("O ALUNO " + aluno + " OBTEVE NOTA " + nota);
        }

    }
}