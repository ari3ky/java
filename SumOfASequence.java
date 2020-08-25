
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number? ");

        int sum = 0;
        int number = Integer.valueOf(scanner.nextLine());

        int i = 0;

        while (i <= number) {
            sum += i;

            i++;

            System.out.println(sum);

        }

    }
}
