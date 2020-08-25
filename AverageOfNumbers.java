
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int numbers = 0;

        while (true) {
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());

            if (number < 0 || number > 0) {
                numbers = numbers + 1;
                sum = (sum + number);

                continue;

            } else if (number == 0) {
                double average = (double) sum / numbers;
                System.out.println("Average of the numbers: " + average);
                break;

            }
        }
    }
}
