package greenfoxorganisation;

public class Mentor extends Person {

    String level;

    public Mentor (String name, int age, String gender, String level) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.level = level;
    }

    public Mentor () {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "Female";
        this.level = "intermediate";
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Educate brilliant junior software developers.");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", " + age + " year old " + gender + ", " + level + " mentor." );
    }
}
