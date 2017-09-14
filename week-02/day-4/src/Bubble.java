import java.util.*;

public class Bubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String scan ="";
        ArrayList numbers = new ArrayList();

        System.out.println("Do you want the list reversed?");
        scan = sc.next();

        boolean ordered = false;
        if (scan.equals("Y") || scan.equals("y")) {
            ordered = true;
        } else {
            System.out.println("As you wish.");
        }

        System.out.println("Give me numbers and I'm going to sort them. I will ask for numbers as long as you don't type *.");
        Fill(numbers, ordered);
        System.out.println(numbers);
    }

    private static ArrayList <Integer> Fill (ArrayList list, boolean answer) {
        Scanner sc = new Scanner(System.in);
        String scan = "";
        int n = 0;
        do {
            scan = sc.next();
            if (!scan.equals("*")) {
                n = Integer.parseInt(scan);
                list.add(n);
            }
        } while (!scan.equals("*"));
        Collections.sort(list);
        if (answer) {
            Collections.reverse(list);
        }
        return (list);
    }
}
