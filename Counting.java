
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.valueOf(scanner.nextLine());
        int end = number;

        for (int i = 0; i <= end; i++) {
            System.out.println(i);
        }

    }
}
