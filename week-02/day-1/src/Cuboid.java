public class Cuboid {
    public static void main(String[] args) {
        int w = 10;
        int l = 15;
        int h = 5;

        int surface = 2 * w * l + 2 * l * h + 2 * h * w;

        System.out.println(surface + "\n");

        int volume = l * w * h;

        System.out.println(volume + "\n");

    }
}
