// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

import java.util.Scanner;

public class Power {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a base and n, and I'll give you the base to the nth power.");
        int base = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(base, n));
    }

    static int power(int base, int n) {
        {
            if ((n) == 0) {
                return 1;
            } else {
                return base * power(base, n-1);
            }
        }
    }
}