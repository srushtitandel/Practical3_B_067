public class Pattern2 {
    public static void main(String[] args) {

        // -------- Star Pyramid --------
        for (int i = 1; i <= 5; i++) {

            // spaces
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println();

        // -------- Alphabet Reverse Pattern --------
        for (int i = 5; i >= 1; i--) {

            // spaces
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            // alphabets
            for (int k = 0; k < i; k++) {
                System.out.print((char)('A' + k) + " ");
            }

            System.out.println();
        }
    }
}