
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Password? ");
        String pass = scan.nextLine();
        String second = "Caput Draconis";
        
        if (pass.equals(second)){
            System.out.println("Welcome! ");
            
        } else {
            System.out.println("Off with you! ");
        }

        // Write your program here 
    }
}
