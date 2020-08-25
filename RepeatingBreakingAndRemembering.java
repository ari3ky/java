
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numbers = 0;
        int oddnumber = 0;
        int evennumber = 0;

        while (true) {
            System.out.println("Give numbers:");
            int number = Integer.valueOf(scanner.nextLine());
            int remainder = number % 2;

            if (remainder == 0) {

                evennumber = evennumber + 1;

            } else if (remainder != 0 && remainder != -1) {
                oddnumber = oddnumber + 1;

            }

            if (number > -1 || number < -1) {
                sum = (sum + number);
                numbers = numbers + 1;

            } else if (number == -1) {
                double average = (double) sum / numbers;
                System.out.println("Thx! Bye! ");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + numbers);
                System.out.println("Average: " + average);
                System.out.println("Even: " + evennumber);
                System.out.println("Odd: " + oddnumber);
                break;

            }

        }
    }
}
