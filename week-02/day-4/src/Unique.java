import java.util.*;

public class Unique {
    public static void main(String[] args) {
        List numbers = new ArrayList();
        Scanner sc = new Scanner(System.in);

        System.out.println("Give me numbers. I will ask for numbers as long as you don't type *.");
        String scan ="";
        int n = 0;
        int duplicates = 0;


        do {
            scan = sc.next();
            if (scan.equals("*")) {
                duplicates++;
            } else {
                n = Integer.parseInt(scan);
                if (numbers.contains(n)) {
                    duplicates++;
                } else {
                    numbers.add(n);
                }
            }
        } while (!scan.equals("*"));

        System.out.println(numbers);

    }


}
