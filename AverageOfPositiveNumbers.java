
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numbers = 0;

        while (true) {

            int number = Integer.valueOf(scanner.nextLine());

            if (number > 0) {
                numbers = numbers + 1;
                sum = (sum + number);

              

            } else if (number == 0 && sum > 0) {
                double average = (double) sum / numbers;
                System.out.println(average);
                break;

            } else if (number == 0 && sum <= 0) {
                System.out.println("Cannot calculate the average ");
                break;
            }
        }
    }
}
