import java.util.*;

public class Unique {

    public static void main(String[] args) {

        ArrayList numbers = new ArrayList();

        System.out.println("Give me numbers. I will ask for numbers as long as you don't type *.");
        Fill(numbers);

        System.out.println(numbers);

    }

    static ArrayList <Integer> Fill (ArrayList list) {
        Scanner sc = new Scanner(System.in);
        String scan ="";
        int n = 0;
        do {
            scan = sc.next();
            if (!scan.equals("*")) {
                n = Integer.parseInt(scan);
                if (!list.contains(n)) {
                    list.add(n);
                }
            }
        } while (!scan.equals("*"));
        return (list);
    }


}