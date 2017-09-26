public class Student extends Person {

    protected String previousOrganisation;
    protected int skippedDays;

    public Student (String name, int age, String gender, String previousOrganisation, int skippedDays) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.previousOrganisation = previousOrganisation;
        this.skippedDays = skippedDays;
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
    public void getGoal() {
        System.out.println("My goal is: Be a junior software developer.");
    }

    @Override
    public void introduction() {
        System.out.println("Hi, I'm " + name + ", " + age + " year old " + gender + "from " + previousOrganisation + "who skipped skipped " + skippedDays + "Days days from the course already.");
    }

}
