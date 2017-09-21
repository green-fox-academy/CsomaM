// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

import java.util.Scanner;

public class Bunny2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me the number of bunnies.");
        int n = sc.nextInt();
        System.out.println("The number of ears: " + earCounter(n));
    }

    static int earCounter(int n) {
        int ears = 0;
        if ((n) == 0) {
            return 0;
        } else {
            if (n % 2 == 0) {
                return ears + 2 + earCounter(n - 1);
            } else {
                return ears + 3 + earCounter(n - 1);
            }
        }
    }
}