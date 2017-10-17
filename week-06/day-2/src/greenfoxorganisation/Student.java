package greenfoxorganisation;

public class Student extends Person implements Cloneable{

    String previousOrganisation;
    int skippedDays;


    public Student (String name, int age, String gender, String previousOrganisation) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.previousOrganisation = previousOrganisation;
        this.skippedDays = 0;
    }

    public Student () {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "Female";
        this.previousOrganisation = "The School of Life";
        this.skippedDays = 0;
    }

    public void skipDays (int numberOfDays) {
        this.skippedDays += numberOfDays;
    }

    @Override
    public Student clone() {
        Student clone = new Student();
        try {
            clone = (Student)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Be a junior software developer.");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", " + age + " year old " + gender + " from " + previousOrganisation + " who skipped " + skippedDays + " Days days from the course already.");
    }
}
