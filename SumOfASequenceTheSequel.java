
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("First number? ");
        int number = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number? ");
        int number2 = Integer.valueOf(scanner.nextLine());

        int i = number;
        while (i <= number2) {
            sum += i;
            i++;

        }
        System.out.println("The sum is: " + sum);
    }
}
