package thegardenapplication;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Plant> garden = new ArrayList<>();

        garden.add(new Flower("yellow"));
        garden.add(new Flower("blue"));
        garden.add(new Tree("purple"));
        garden.add(new Tree("orange"));

        showGarden(garden);

        water(garden, 40);

        showGarden(garden);

        water(garden, 70);

        showGarden(garden);

    }

    static void showGarden (ArrayList<Plant> garden) {
        for (int i = 0; i < garden.size(); i++) {
            System.out.println(garden.get(i));
        }
        System.out.println("\n");
    }

    static void water (ArrayList<Plant> garden, int amount) {
        System.out.println("Watering with " + amount);
        for (int i = 1; i < garden.size() + 1; i++) {
            garden.get(i-1).water(amount/i);
        }
        System.out.println("\n");
    }
}
