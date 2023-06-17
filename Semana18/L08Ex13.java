public class L08Ex13 {
    public static void main(String[] args) {
        int [] vet = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        while (true) {
            int x = 5;
            int y = 8;

            if (x == -1 || y == -1) {
                break;
            }

            int vx = vet[x];
            int vy = vet[y];

            int soma = vx + vy;    // vet[x] + vet[y];

            System.out.println("SOMA " + soma);
        }
    }
}
