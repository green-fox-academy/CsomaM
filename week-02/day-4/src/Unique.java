import java.util.*;

public class Unique {

    public static void main(String[] args) {
        System.out.println("Give me numbers. I will ask for numbers as long as you don't type *.");
        System.out.println(sort(fill()));

    }
    static ArrayList <Integer> fill () {
        ArrayList numbers = new ArrayList();
        Scanner sc = new Scanner(System.in);
        String scan ="";
        int n = 0;
        do {
            scan = sc.next();
            if (!scan.equals("*")) {
                n = Integer.parseInt(scan);
                numbers.add(n);
            }
        } while (!scan.equals("*"));
        return (numbers);
    }


    static ArrayList <Integer> sort (ArrayList list) {
        ArrayList sorted = new ArrayList();
        for (int i = 0; i <list.size(); i++) {
            if (!sorted.contains(list.get(i))) {
                sorted.add(list.get(i));
            }
        }
        return (sorted);
    }


}