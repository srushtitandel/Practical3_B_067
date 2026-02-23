public class EvenNumbers {

    public static void main(String[] args) {

        System.out.println("Even Numbers Between 1 to 100:");

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {

                System.out.print(i + " ");

                if (i < min) {
                    min = i;
                }

                if (i > max) {
                    max = i;
                }

                sum += i;
            }
        }

        System.out.println("\n\nMinimum Even Number: " + min);
        System.out.println("Maximum Even Number: " + max);
        System.out.println("Total Sum of Even Numbers: " + sum);
    }
}