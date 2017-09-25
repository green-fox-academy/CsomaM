import java.util.ArrayList;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

        dominoOrder(dominoes);

        System.out.println(dominoes);
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }

    static void dominoOrder (List<Domino> list) {
        List<Domino> ordereddominoes = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int [] val1 = list.get(i).getValues();
            for (int j = 1; j < list.size()-1; j++) {
                int [] val2 = list.get(j).getValues();
                if (val1[1] == val2[0] && !ordereddominoes.contains(list.get(i)) && !ordereddominoes.contains(list.get(j))) {
                    ordereddominoes.add(list.get(i));
                    ordereddominoes.add(list.get(j));
                }
            }
        }
        list.clear();
        list.addAll(ordereddominoes);
    }
}