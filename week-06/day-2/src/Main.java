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

        System.out.println("Test 1, create Electric Guitar, Bass Guitar and Violin with default strings.");
        ElectricGuitar guitar = new ElectricGuitar();
        BassGuitar bassGuitar = new BassGuitar();
        Violin violin = new Violin();

        System.out.println("Test 1 Play");
        guitar.play();
        bassGuitar.play();
        violin.play();

        System.out.println("Test 2, create Electric Guitar, Bass Guitar with 7 and 5 strings .");
        ElectricGuitar guitar2 = new ElectricGuitar(7);
        BassGuitar bassGuitar2 = new BassGuitar(5);

        System.out.println("Test 2 Play");
        guitar2.play();
        bassGuitar2.play();
    }
}
