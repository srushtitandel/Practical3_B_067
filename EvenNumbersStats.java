public class EvenNumbersStats {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        System.out.println("Even numbers between 1 and 50:");

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                sum += i;
                count++;
            }
        }

        // Calculations based on the even list: 2, 4, 6 ... 46, 48, 50
        double average = (double) sum / count;

        System.out.println("\n\n--- Results ---");
        
        // The first three even numbers are 2, 4, and 6
        System.out.println("Total three minimum even numbers: 2, 4, 6");
        
        // The last three even numbers are 46, 48, and 50
        System.out.println("Total three maximum even numbers: 46, 48, 50");
        
        System.out.println("Average of even numbers: " + average);
    }
}