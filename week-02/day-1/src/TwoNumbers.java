public class TwoNumbers {
    public static void main(String[] args) {
        // Create a program that prints a few operations on two numbers: 22 and 13
        float twentytwo = 22;
        float thirteen = 13;
        // Print the result of 13 added to 22
        System.out.println("13 + 22 = " + (thirteen + twentytwo));
        // Print the result of 13 substracted from 22
        System.out.println("13 - 22 = " + (thirteen - twentytwo));
        // Print the result of 22 mutiplied by 13
        System.out.println("13 * 22 = " + (thirteen * twentytwo));
        // Print the result of 22 divided by 13 (as a decimal fraction)
        float noremainder = thirteen / twentytwo;
        int number;
        System.out.println("13 / 22 = " + (number = (int)noremainder));
        // Print the integer part of 22 divided by 13
        System.out.println("13 / 22 = " + (thirteen / twentytwo) + " with remainder");
        // Print the reminder of 22 divided by 13

    }
}