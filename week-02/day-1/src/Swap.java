public class Swap {
    public static void main(String[] args) {
        int a = 123;
        int b = 526;
        // Swap the values of the wariables

        a += (b - (b = a));


        System.out.println(a);
        System.out.println(b);
    }
}