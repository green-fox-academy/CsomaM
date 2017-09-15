import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n, digits = 0;
        n = infoReq();
        digits = digits(n);
        if (armstrong(n, digits)) {
            System.out.println("It's an armstrong number.");
        } else {
            System.out.println("It's not an armstrong number.");
        }
    }

    static int infoReq () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number");
        int n = 0;
        n = sc.nextInt();
        return n;
    }

    static int digits (int n) {
        int length = String.valueOf(n).length();
        return length;
    }

    static boolean armstrong (int n, int digits) {
        boolean armstrong;
        int sum= 0;
        int remainder;
        int temp = n;

        while (temp != 0) {
            remainder = temp%10;
            sum = sum + power(remainder, digits);
            temp = temp/10;
        }

        if (n == sum) {
            armstrong = true;
        } else {
            armstrong = false;
        } return armstrong;
    }

    static int power(int n, int r) {
        int c, p = 1;
        for (c = 1; c <= r; c++)
            p = p*n;
        return p;
    }
}
