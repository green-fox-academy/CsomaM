import java.util.*;

public class Matchmaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));
        ArrayList<String> order = new ArrayList<String>();

        // Join the two lists by matching one girl with one boy in the order list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        order.addAll(girls);
        order.addAll(boys);

        int j = 0;
        for (int i= 0; i < girls.size()-1; i++) {
            if (j < girls.size()-1) {
                order.set(j, girls.get(i));
                j+=2;
            }
        }
        j = 1;
        for (int i= 0; i < boys.size()-1; i++) {
            if (j < boys.size()-1) {
                order.set(j, boys.get(i));
                j+=2;
            }
        }
        System.out.println(order);
    }
}