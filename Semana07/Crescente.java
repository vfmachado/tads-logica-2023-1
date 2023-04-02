public class Crescente {
    public static void main(String[] args) {

        int a = 10, b = 20, c = 30;
        
        if (a < b && a < c) {
            if (b < c) {
                // a b c
            } else {
                // a c b
            }
        } else if (c < b && c < a) {
            if (b < a) {
                // c b a
            } else {
                // c a b
            }
        } else {
            if (c < a) {
                // b c a
            } else {
                // b a c 
            }
        }

    }
}