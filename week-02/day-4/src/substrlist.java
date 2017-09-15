import com.sun.org.apache.xerces.internal.xs.StringList;

import java.lang.reflect.Array;
import java.util.*;
public class substrlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> s = new ArrayList<String>();
        s = fill(s);
        String findS="";
        findS = find(findS);
        System.out.println(indexOf(s, findS));
    }

    static ArrayList <String> fill (ArrayList<String> list) {
        Scanner sc = new Scanner(System.in);
        String scan;
        System.out.println("I'm going to read words until you type *.");
        scan = sc.next();
        do {
            if (!scan.equals("*")) {
                list.add(scan);
            }
            scan = sc.next();
        } while (!scan.equals("*"));
        return (list);
    }

    static int indexOf (ArrayList<String> list, String s) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains(s)){
                index = i;
            }
        }
        return (index);
    }

    static String find (String s) {
        Scanner sc = new Scanner(System.in);
        String scan;
        System.out.println("Give me a word to find.");
        scan = sc.next();
        return (scan);
    }
}