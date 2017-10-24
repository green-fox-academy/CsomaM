import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ParkingLot garage = new ParkingLot();
        ArrayList<Car> carList = garage.createList();
        garage.countCarTypes(carList);
        garage.countCarColours(carList);
        garage.countSameCars(carList);
        stringOut(stringSplit("lovebarbara", 4));
        stringOut(stringSplit("lovebarbara", 20));
    }

    static void stringOut (String[] test) {
        try {
            if (!test[0].equals(null)) {
                System.out.println(Arrays.toString(test));
            }
        } catch (NullPointerException n) {
            System.out.println("Give me a valid index");
        }

    }

    public static String[] stringSplit (String s, int index) {
        String[] split = new String[2];
        try {
            split[0] = s.substring(0, index);
            split[1] = s.substring(index);

        } catch (IndexOutOfBoundsException i) {
        }
        return split;
    }
}
