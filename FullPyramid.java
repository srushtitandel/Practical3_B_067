public class FullPyramid {

    public static void main(String[] args) {

        System.out.println("Full Pyramid:");

        int rows = 5;

        for (int i = 0; i < rows; i++) {

            // Print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = rows; k > i; k--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}