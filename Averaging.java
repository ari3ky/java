
public class Averaging {

    // implement the sum method here again
    public static double sum(int number1, int number2, int number3, int number4) {
        // write some code here
        double sum;
        sum = 0;
        sum = number1 + number2 + number3 + number4;
        return sum;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        //write some code here
        double sum;
        sum = 0;
        sum = number1 + number2 + number3 + number4;
        return sum /4;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        
        System.out.println("Average: " + result);
    }
}
