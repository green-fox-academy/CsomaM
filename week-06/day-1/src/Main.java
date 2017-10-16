public class Main {

    public static void main(String[] args) {
        GameMechanics gm = new GameMechanics();
        String[] input = new String[]{"2H","3D","5S","9C","KD"};
        Hand white = new Hand(input);
        System.out.println(white.handOut());
        System.out.println((gm.highestCard(white)));
    }
}
