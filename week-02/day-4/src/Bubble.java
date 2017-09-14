import java.util.*;

public class Bubble {
    public static void main(String[] args) {
        List numbers = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me numbers and I'm going to sort them. I will ask for numbers as long as you don't type *.");
        String scan = "";
        int n = 0;

        do {
            scan = sc.next();
            if (!scan.equals("*")) {
                n = Integer.parseInt(scan);
                if (!numbers.contains(n)) {
                    numbers.add(n);
                }
            }
        } while (!scan.equals("*"));

        /* If you want duplicates, comment out the other one :)
        do {
            scan = sc.next();
            if (!scan.equals("*")) {
                n = Integer.parseInt(scan);
                numbers.add(n);
            }
        } while (!scan.equals("*"));*/


        Collections.sort(numbers);
        System.out.println(numbers);

        System.out.println("Do you want it reversed? Y/N");
        scan = sc.next();
        if (scan.equals("Y") || scan.equals("y")) {
            Collections.reverse(numbers);
            System.out.println(numbers);
        } else {
            System.out.println("As you wish.");
        }
    }
}
