
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(9, 12);

    }

    public static void divisibleByThreeInRange(int beginning, int end) {

        for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.print(i + "\n");
                
            }
        }
    }
}
