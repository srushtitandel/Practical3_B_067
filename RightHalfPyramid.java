public class RightHalfPyramid {

    public static void main(String[] args) {

        System.out.println("Right Half Pyramid:");

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}