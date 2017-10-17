import greenfoxorganisation.Student;

public class Main {

    public static void main(String[] args) {
        Student john = new Student("John Doe", 20, "male", "BME");
        Student johnTheClone = john.clone();
        johnTheClone.introduce();

        Gnirts g = new Gnirts("example");
        System.out.println(g.charAt(1));

        Shifter s = new Shifter("example", 2);
        System.out.println(s.charAt(0));
    }
}
