import java.util.*;
public class Calculator {
    public static void main(String... args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations:
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit

        Scanner sc = new Scanner(System.in);
        System.out.println("PLease type in the expression.");
        String input= sc.nextLine();
        String operand = input.substring(0, 1);
        String firstNum = input.substring(2, (input.indexOf(" ", 2)));
        String secondNum = input.substring((input.indexOf(" ", 2) + 1), (input.length()));

        int firstN = Integer.parseInt(firstNum);
        int secondN = Integer.parseInt(secondNum);
        double result = 0;

        if (operand.equals("*")) {
            result = firstN * secondN;
        } else if (operand.equals("/")) {
            result = firstN / (double)secondN;
        } else if (operand.equals("-")) {
            result = firstN - secondN;
        } else if (operand.equals("+")) {
            result = firstN + secondN;
        }else if (operand.equals("%")) {
            result = firstN % secondN;
        }

        System.out.println(result);


    }
}