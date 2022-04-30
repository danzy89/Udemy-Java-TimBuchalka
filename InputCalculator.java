import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        long avg = 0;
        double avgSum = 0;

        while (true) {

            boolean isAndInt = scanner.hasNextInt();

            if (isAndInt) {
                int number = scanner.nextInt();
                count++;
                sum += number;
                avgSum += number;
                avg = Math.round(avgSum / count);

            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
