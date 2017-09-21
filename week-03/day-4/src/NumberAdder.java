// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

import java.util.Scanner;

public class NumberAdder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number.");
        int n = sc.nextInt();
        adder(n);
    }

    public static int adder(int n) {
        int total;
        if(n==1){
            total =1;
            System.out.println(total);
        }else{
            total = adder(n-1)+n;
            System.out.println(total);
        }
        return total;
    }
}