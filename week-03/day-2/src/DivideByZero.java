// create a function that takes a number
// divides ten with it,
// and prints the result.
// it should print "fail" if the parameter is 0

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        System.out.println("Give me a number.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try {
            System.out.println(10/n);
        } catch (ArithmeticException zeroDivide){
            System.out.println("fail");
        }
    }
}