import java.util.ArrayList;
import java.util.Scanner;

public class subint {
    public static void main(String[] args) {
        System.out.println("Give me a number then give me a list of numbers. I will ask for numbers as long as you don't type *.");
        int n = findpls();
        ArrayList arr = fill();
        ArrayList index = find(n, arr);
        System.out.println(index);

    }
    static ArrayList<Integer> fill () {
        ArrayList numbers = new ArrayList();
        Scanner sc = new Scanner(System.in);
        String scan ="";
        int n = 0;
        scan = sc.next();
        do {
            if (!scan.equals("*")) {
                n = Integer.parseInt(scan);
                numbers.add(n);
            }
            scan = sc.next();
        } while (!scan.equals("*"));
        return (numbers);
    }

    static int findpls () {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        int soughtnr = 0;
        if (!number.equals("*")) {
            soughtnr = Integer.parseInt(number);
        }
        return (soughtnr);
    }

    static ArrayList<Integer> find (int n,ArrayList list) {
        ArrayList<Integer> indexList = new ArrayList();
        int temp;
        String contains;
        String number;
        for (int i=0; i<list.size(); i++){
            temp = (Integer)list.get(i);
            if (temp == n){
                indexList.add(i);
            } else if (temp > 9) {
                contains = Integer.toString(temp);
                number = Integer.toString(n);
                if (contains.contains(number)) {
                    indexList.add(i);
                }
            }
        }
        return (indexList);
    }

}
