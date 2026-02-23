public class PatternProgram {
    public static void main(String[] args) {

        // ----------- Star Pattern -----------
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // ----------- Number Pattern -----------
        int num = 1;

        // First row (1 to 5)
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Second row (6 to 9)
        for (int i = 6; i <= 9; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Third row (1 to 3)
        for (int i = 1; i <= 3; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Fourth row (4 to 5)
        for (int i = 4; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Fifth row (6)
        System.out.println("6");
    }
}