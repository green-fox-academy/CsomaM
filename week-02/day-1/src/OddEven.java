import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number");
        int a = scanner.nextInt();

        if (a % 2 == 0) {
            System.out.println("It's even!");
        } else {
            System.out.println("It's odd!!");
        }
    }
}
