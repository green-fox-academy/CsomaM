// Given a non-negative int n, return the sum of its digits recursively (no loops). 
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while 
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

import java.util.Scanner;

public class SumDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number.");
        int n = sc.nextInt();
        System.out.println(sumDigits(n));
    }

    static int sumDigits(int n) {
        {
            if ((n/10) == 0) {
                return 1;
            } else {
                return 1 + sumDigits(n/10);
            }
        }
    }
}