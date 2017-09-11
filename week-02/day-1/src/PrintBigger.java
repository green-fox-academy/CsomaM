
import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give two numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a < b) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
}