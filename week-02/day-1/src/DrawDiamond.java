import java.util.Scanner;
public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);

        int n, c, k, space = 1;
        System.out.println("Enter number of rows: ");
        n=scanner.nextInt();

        space = n - 1;

        for (k = 1; k<=n; k++) {
            for (c = 1; c<=space; c++) {
                System.out.print(" ");
            }
            space--;
            for (c = 1; c<= 2*k-1; c++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        space = 1;

        for (k = 1; k<= n - 1; k++) {
            for (c = 1; c <= space; c++) {
                System.out.print(" ");
            }
            space++;
            for (c = 1; c <= 2 * (n - k) - 1; c++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}